package org.sunflow.core.renderer;

import org.sunflow.BatteryContext;
import org.sunflow.core.Display;
import org.sunflow.core.ImageSampler;
import org.sunflow.core.IntersectionState;
import org.sunflow.core.Options;
import org.sunflow.core.Scene;
import org.sunflow.core.ShadingState;
import org.sunflow.image.Color;
import org.sunflow.system.Timer;
import org.sunflow.system.UI;
import org.sunflow.system.UI.Module;

public class SimpleRenderer@mode<?->X> implements ImageSampler@mode<X> {
    private Scene@mode<*> scene;
    private Display display;

    private int imageWidth, imageHeight;
    private int numBucketsX, numBucketsY;
    private int bucketCounter, numBuckets;

    attributor {
      // Just simulate for now
      int batteryMode = BatteryContext.batteryMode;

      if (batteryMode == 2) {
        return @mode<high>;
      } else if (batteryMode == 1) {
        return @mode<mid>;
      } else {
        return @mode<low>;
      }
    } 

    public boolean prepare(Options options, Scene scene, int w, int h) {
        this.scene = scene;
        imageWidth = w;
        imageHeight = h;
        numBucketsX = (imageWidth + 31) >>> 5;
        numBucketsY = (imageHeight + 31) >>> 5;
        numBuckets = numBucketsX * numBucketsY;
        return true;
    }

    public void render(Display display) {
        this.display = display;
        display.imageBegin(imageWidth, imageHeight, 32);
        // set members variables
        bucketCounter = 0;
        // start task
        Timer timer = new Timer();
        timer.start();

        Thread[] renderThreads = new Thread[scene.getThreads()];
        for (int i = 0; i < renderThreads.length; i++) {
            renderThreads[i] = new BucketThread();
            renderThreads[i].start();
        }
        for (int i = 0; i < renderThreads.length; i++) {
            try {
                renderThreads[i].join();
            } catch (InterruptedException e) {
                UI.printError(Module.BCKT, "Bucket processing thread %d of %d was interrupted", i + 1, renderThreads.length);
            }
        }
        timer.end();
        UI.printInfo(Module.BCKT, "Render time: %s", timer.toString());
        display.imageEnd();
    }

    private class BucketThread extends Thread {
        public void run() {
            IntersectionState istate = new IntersectionState();
            while (true) {
                int bx, by;
                synchronized (SimpleRenderer.this) {
                    if (bucketCounter >= numBuckets)
                        return;
                    by = bucketCounter / numBucketsX;
                    bx = bucketCounter % numBucketsX;
                    bucketCounter++;
                }
                renderBucket(bx, by, istate);
            }
        }
    }

    public void renderBucket(int bx, int by, IntersectionState istate) {
        // pixel sized extents
        int x0 = bx * 32;
        int y0 = by * 32;
        int bw = Math.min(32, imageWidth - x0);
        int bh = Math.min(32, imageHeight - y0);

        Color[] bucketRGB = new Color[bw * bh];

        for (int y = 0, i = 0; y < bh; y++) {
            for (int x = 0; x < bw; x++, i++) {
                ShadingState state = scene.getRadiance(istate, x0 + x, imageHeight - 1 - (y0 + y), 0.0, 0.0, 0.0, 0);
                bucketRGB[i] = (state != null) ? state.getResult() : Color.BLACK;
            }
        }
        // update pixels
        display.imageUpdate(x0, y0, bw, bh, bucketRGB);
    }

}
