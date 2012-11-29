package gamex.core;

import gamex.primitives.Map;
import gamex.primitives.MapBlock;

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
		int rowNumber, columnNumber;
		for (int i = 0; i < map.getBlocks().size(); i++) {
			block = map.getBlocks().get(i);

			// Calculate the row and column in which the block will appear
			rowNumber = (int) Math.floor(i / blocksInRow);
			columnNumber = i % blocksInRow;

			// Paint the block at the correct on-screen position
			block.paint(graphics, columnNumber * block.getWidth(), rowNumber * block.getHeight());
		}
	}

}
