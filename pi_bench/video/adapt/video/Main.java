package video; 

modes {low <: mid; mid <: high; };

public class Main@mode<?->X> {
	int width = 0;
	int height = 0;

	public Main(int width, int height) {
		this.width = width;
		this.height = height;
	}

	attributor {
		if (ENT_Util.Battery.percentRemaining() >= 0.75) {
      return @mode<high>;
    } else if (ENT_Util.Battery.percentRemaining() >= 0.50) {
      return @mode<mid>;
    } else {
      return @mode<low>;
    }

	}

	mcase<int> vidFreq = mcase<int> { 
		low: 10;
		mid: 20;
		high: 30;
	};

	public void execute(int timeout) {
		try {
      RaspiVid video = new RaspiVid();
			video.TakeVideo("vid.mp4", this.width, this.height, this.vidFreq, timeout);
		} catch (Exception e) {
      System.exit(e.hashCode());
    }
	}

  public static void main(String[] args) {
		if (args.length < 2) {
			System.err.format("usage: [WIDTH] [HEIGHT]\n", args[0]);
			System.exit(1);
		}

		int width = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);

		ENT_Util.initModeFile();
		int PANDA_RUNS = Integer.parseInt(System.getenv("PANDA_RUNS"));

		Main@mode<?> maindyn = new Main@mode<?>(width, height);
		Main@mode<*> main = snapshot maindyn ?mode[@mode<low>,@mode<high>];

		System.err.format("Starting warmup\n");

		main.execute(30000);

		System.out.format("Done with warmup\n");

		for (int k = 0; k < PANDA_RUNS; k++) {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.err.println(e);
			}

			Main@mode<?> maindyn2 = new Main@mode<?>(width, height);
			Main@mode<*> main2 = snapshot maindyn2 ?mode[@mode<low>,@mode<high>];


			System.err.format("Starting main %d\n", k);

			main2.execute(60000);

			System.err.format("Finished main %d\n", k);
		} 

		ENT_Util.closeModeFile();
  }
}
