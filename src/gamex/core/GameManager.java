package gamex.core;

import gamex.helpers.DrawingThread;
import gamex.primitives.Map;

import java.awt.*;

public class GameManager {
	private int fps = 80;
	private Graphics graphics;
	private DrawingThread drawingThread;
	private Map map;
	
	public GameManager(Graphics graphics) {
		this.graphics = graphics;
		initialize();
	}
	
	public GameManager(Graphics graphics, int fps) {
		this.fps = fps;
		this.graphics = graphics;
		initialize();
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public void initialize() {
		drawingThread = new DrawingThread(this, new MapDrawingManager(graphics)).setFps(fps).start();
	}

	public void stop() {
		drawingThread.stop();
	}
}
