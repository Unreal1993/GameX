/**
 * Name    : DrawingThread.java
 * Project : GameX
 * Author  : Robert M Hubinsky <r.hubinsky@hotmail.com>
 * Created : 28.11.2012
 */
package gamex.helpers;

import gamex.primitives.DrawingObject;

public class DrawingThread implements Runnable {

	private boolean shouldRun = false;
	private int fps = 80;
	private DrawingObject drawingObject;

	private Thread thread;

	public DrawingThread() {
		thread = new Thread(this);
	}

	public void run() {
		while (shouldRun) {
			if (drawingObject != null) {
				drawingObject.paint();
				try {
					sleep();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void sleep() throws InterruptedException {
		Thread.sleep(1000 / getFps());
	}

	public void start() {
		shouldRun = true;
		thread.start();
	}

	public void stop() {
		shouldRun = false;
		thread.stop();
	}

	public int getFps() {
		return fps;
	}

	public void setFps(int fps) {
		this.fps = fps;
	}

	public void setDrawingObject(DrawingObject drawingObject) {
		this.drawingObject = drawingObject;
	}
}
