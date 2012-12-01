/**
 * Name    : DrawingThread.java
 * Project : GameX
 * Author  : Robert M Hubinsky <r.hubinsky@hotmail.com>
 * Created : 28.11.2012
 */
package gamex.helpers;

import gamex.core.GameManager;
import gamex.core.MapDrawingManager;
import gamex.gui.Main;

import java.awt.event.KeyEvent;

public class DrawingThread implements Runnable {

	private boolean shouldRun = false;
	private int fps = 80;
	private GameManager gameManager;
	private MapDrawingManager mapDrawingManager;

	private Thread thread;

	private int i = 0;

	public DrawingThread(GameManager gameManager, MapDrawingManager drawingManager) {
		thread = new Thread(this);
		this.gameManager = gameManager;
		this.mapDrawingManager = drawingManager;
	}

	public void handleInput() {
		if (Main.isKeyPressed(KeyEvent.VK_UP)) {
			mapDrawingManager.moveCamera(0, -1);
		}
		if (Main.isKeyPressed(KeyEvent.VK_DOWN)) {
			mapDrawingManager.moveCamera(0, 1);
		}
		if (Main.isKeyPressed(KeyEvent.VK_LEFT)) {
			mapDrawingManager.moveCamera(-1, 0);
		}
		if (Main.isKeyPressed(KeyEvent.VK_RIGHT)) {
			mapDrawingManager.moveCamera(1, 0);
		}
	}

	public void run() {
		while (shouldRun) {
			handleInput();
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
