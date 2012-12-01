package gamex.primitives;

import gamex.gameobjects.MapBlock;

import java.awt.*;

public class Camera {

	Point centerPosition;

	public Camera(Point centerPosition) {
		this.centerPosition = centerPosition;
	}

	public void setCenterPosition(Point centerPosition) {
		this.centerPosition = centerPosition;
	}

	public void move(int x, int y) {
		centerPosition = new Point((int) centerPosition.getX() + x, (int) centerPosition.getY() + y);
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
