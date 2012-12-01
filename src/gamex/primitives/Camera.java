package gamex.primitives;

import gamex.gameobjects.MapBlock;
import gamex.helpers.Position;

import java.awt.*;

public class Camera {

	Position centerPosition;

	public Camera(Position centerPosition) {
		this.centerPosition = centerPosition;
	}

	public void setCenterPosition(Position centerPosition) {
		this.centerPosition = centerPosition;
	}

	public void move(int x, int y) {
		centerPosition = new Position(centerPosition.getX() + x, centerPosition.getY() + y);
	}

	public void paint(Graphics g, Map map, MapBlock block) {
		final int blocksInRow = 16;
		int blockIndex = map.getBlocks().indexOf(block);
		int col = blockIndex % blocksInRow, row = (int) Math.floor(blockIndex / blocksInRow);

		col -= centerPosition.getX();
		row -= centerPosition.getY();

		g.drawImage(block.paint(), row * block.getDimension(), col * block.getDimension(), null);
	}

}
