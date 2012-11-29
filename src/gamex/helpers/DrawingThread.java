/**
 * Name    : DrawingThread.java
 * Project : GameX
 * Author  : Robert M Hubinsky <r.hubinsky@hotmail.com>
 * Created : 28.11.2012
 */
package gamex.helpers;

import gamex.core.GameManager;
import gamex.core.MapDrawingManager;

public class DrawingThread implements Runnable {

	private boolean shouldRun = false;
	private int fps = 80;
	private GameManager gameManager;
	private MapDrawingManager mapDrawingManager;

	private Thread thread;

	public DrawingThread(GameManager gameManager, MapDrawingManager drawingManager) {
		thread = new Thread(this);
		this.gameManager = gameManager;
		this.mapDrawingManager = drawingManager;
	}

	public void run() {
		while (shouldRun) {
			mapDrawingManager.draw(gameManager.getMap());
			try {
				sleep();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void sleep() throws InterruptedException {
		Thread.sleep(1000 / getFps());
	}

	public DrawingThread start() {
		shouldRun = true;
		thread.start();
		return this;
	}

	public void stop() {
		shouldRun = false;
	}

	public int getFps() {
		return fps;
	}

	public DrawingThread setFps(int fps) {
		this.fps = fps;
		return this;
	}

}
