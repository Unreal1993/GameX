package gamex.core;

import gamex.gameobjects.MapBlock;
import gamex.primitives.Map;

import java.awt.*;

public class MapDrawingManager {

	private Graphics graphics;

	public MapDrawingManager(Graphics graphics) {
		this.graphics = graphics;
	}

	public void draw(Map map) {
		// This implementation will need to change once it becomes impractical
		// to draw the whole map at once

		final int blocksInRow = 16;

		MapBlock block;
		for (int i = 0; i < map.getBlocks().size(); i++) {
			block = map.getBlocks().get(i);
			block.paint(graphics);
		}
	}

}
