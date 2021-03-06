package util;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Set;
import java.util.TreeSet;

import it.unimi.dsi.webgraph.ImmutableGraph;
import it.unimi.dsi.webgraph.Transform;

import jrapl.EnergyCheckUtils;

modes { low <: mid; mid <: high; }

public class PageRankBench@mode<?->X> { 
  private double alpha;
  private double error;
  private boolean recover = true;

  attributor {
    if (useBat) {
      if (ENT_Util.Battery.percentRemaining() >= 0.75) {
        return @mode<high>;
      } else if (ENT_Util.Battery.percentRemaining() >= 0.50) {
        return @mode<mid>;
      } else {
        return @mode<low>;
      }
    } else {
      if (error >= 0.001) {
        return @mode<high>;
      } else if (error >= 0.00001) {
        return @mode<mid>;
      } else {
        return @mode<low>;
      }
    }
  }

  private boolean useBat = false;

  public PageRankBench(double alpha, double error) {
    this.alpha = alpha;
    this.error = error;

    String recoverstr = System.getenv("PANDA_RECOVER");
    if (recoverstr != null && recoverstr.equals("false")) {
      recover = false;
    }

    String useBatStr = System.getenv("PANDA_BATTERY_RUN");
    if (useBatStr != null && useBatStr.equals("true")) {
      useBat = true;
    }

  }

  public double[] pagerank(PageRankGraph@mode<?> dynpg) {
    PageRankGraph@mode<*> pg;
    try {
      pg = snapshot dynpg ?mode[@mode<low>,@mode<X>];
    } catch (Exception e) {
      pg = snapshotforce dynpg ?mode[@mode<low>,@mode<X>];
      if (recover) {
        error = 0.01;
      }
    }

    int nnodes = pg.g.numNodes();
    double[] s1 = new double[nnodes];
    double[] s2 = new double[nnodes];
    for (int i = 0; i < nnodes; i++) {
      s1[i] = 1.0/nnodes;
    }

    double[] step = null;
    double[] last = null;
    for (int n = 0; n < 200; n++) {
      // Pass
      double worst = Double.MIN_VALUE;

      if (n % 2 == 0) {
        last = s1;
        step = s2;
      } else {
        last = s2;
        step = s1;
      }

      for (int i = 0; i < nnodes; i++) {
        step[i] = 0;
      }

      double distribute = 0.0;
      for (int i = 0; i < nnodes; i++) {
        // Grab rank distributed across graph when
        if (pg.g.outdegree(i) == 0) {
          distribute += last[i];  
        }

        // Grab all incomming edges
        int[] income = pg.t.successorArray(i); 
        for (int j = 0; j < income.length; j++) {
          int e = income[j];
          step[i] += (last[e]/pg.g.outdegree(e));
        } 
      }

      for (int i = 0; i < nnodes; i++) {
        step[i] += distribute / nnodes;
        step[i] = (1.0 - alpha) + alpha * step[i];

        double diff = Math.abs(last[i] - step[i]);
        if (diff > worst) {
          worst = diff;
        }
      }

      if (worst <= error) {
        break; 
      }
    }

    return step;
  }

  public static void main(String[] args) {
    if (args.length < 1) {
      System.err.format("usage [INPUT_FILE]\n");
      System.exit(1);
    }

    ImmutableGraph g = null;
    try {
      g = ImmutableGraph.load(args[0]);
    } catch (Exception e) {
      System.err.println("Caught: " + e.getMessage());
      e.printStackTrace(System.err);
    }

    ImmutableGraph t = Transform.transpose(g, null);

    int PANDA_RUNS = Integer.parseInt(System.getenv("PANDA_RUNS"));
    double error = Double.parseDouble(System.getenv("PANDA_PAGERANK_ALPHA"));

    // Ent part
    ENT_Util.initModeFile();

    double energyTotal = 0.0;
    for (int k = 0; k < PANDA_RUNS; k++) {
      double[] before = EnergyCheckUtils.getEnergyStats();
      ENT_Util.resetStopwatch();
      ENT_Util.startStopwatch();

      PageRankBench b = snapshot (new PageRankBench@mode<?>(0.85, error)) ?mode[@mode<low>,@mode<high>];
      PageRankGraph@mode<?> dynpg = new PageRankGraph@mode<?>(g,t);
      double[] r = b.pagerank(dynpg);

      double[] after = EnergyCheckUtils.getEnergyStats();

      double diff = after[2]-before[2];

      ENT_Util.stopStopwatch();

      if (diff < 0) {
        diff += EnergyCheckUtils.wraparoundValue;
      }

      ENT_Util.writeModeFile(String.format("ERun %d: %f %f %f %f\n", k, after[0]-before[0], after[1]-before[1], diff, ENT_Util.elapsedTime()));
    }

    ENT_Util.closeModeFile();
    EnergyCheckUtils.DeallocProfile();

    /*
    JungAdapter jg = new JungAdapter(g, t);


    PageRank<Integer,Long> pr = new PageRank<Integer,Long>(jg, 0.85);
    //HITS<Integer,Long> pr = new HITS<Integer,Long>(jg, 0.15);

    double tolerence = Double.parseDouble(System.getenv("PANDA_PAGERANK_ALPHA"));
    int iters = Integer.parseInt(System.getenv("PANDA_PAGERANK_ITERATIONS"));

    pr.setMaxIterations(2);
    pr.evaluate();

    double sum = 0;
    Set<Integer> sortedVerticesSet = new TreeSet<Integer>(jg.getVertices());
    for (Integer v : sortedVerticesSet) {
      double score = pr.getVertexScore(v);
      sum += score;
      System.out.println(v + " = " + score);
    }
    System.out.println("s = " + sum * g.numNodes());
    System.out.println("normalizd = " + sum);
    */

  }
}
