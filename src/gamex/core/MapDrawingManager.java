package gamex.core;

import gamex.gameobjects.MapBlock;
import gamex.helpers.Position;
import gamex.primitives.Camera;
import gamex.primitives.Map;

import java.awt.*;

public class MapDrawingManager {

	private Graphics graphics;
	private Camera camera;

	public MapDrawingManager(Graphics graphics) {
		this.graphics = graphics;
		camera = new Camera(new Position(0, 0));
	}

	public void setCameraCenterPosition(Position position) {
		camera.setCenterPosition(position);
	}

	public void moveCamera(int x, int y) {
		camera.move(x, y);
	}

	public void draw(Map map) {
		// This implementation will need to change once it becomes impractical
		// to paint the whole map at once

		graphics.clearRect(0, 0, 1000, 1000);

		for (MapBlock block : map.getBlocks()) {
			camera.paint(graphics, map, block);
		}
	}

}
