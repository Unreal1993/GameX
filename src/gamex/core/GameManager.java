/**
  * Name    : GameManager.java
  * Project : GameX
  * Author  : Robert M Hubinsky <r.hubinsky@hotmail.com>
  * Created : 28.11.2012
  */
package gamex.core;

import gamex.helpers.DrawingThread;
import gamex.primitives.DrawingObject;

public class GameManager {
	private int fps = 80 ;
	private DrawingObject drawingObject;
	private DrawingThread drawingThread;

	public GameManager(DrawingObject drawingObject, int fps) {
		this.fps = fps;
		this.drawingObject = drawingObject;
		initialize();
	}
	
	public void initialize() {
		try {
			drawingThread = new DrawingThread();
			drawingThread.setDrawingObject(drawingObject);
			drawingThread.setFps(fps);
            drawingThread.start();
		}catch(Exception e) {
			System.out.println("Failed to initialize the game manager");
		}
	}	
	
	public void stop() {
		drawingThread.stop();
	}
}
