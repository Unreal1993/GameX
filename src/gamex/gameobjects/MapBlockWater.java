package gamex.gameobjects;

import gamex.enums.MapBlockType;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class MapBlockWater extends MapBlock {
	/**
	 * @param width
	 * @param height
	 * @param position
	 */
	public MapBlockWater(int width, int height, Point position) {
		super(width, height, position);
		this.blockType = MapBlockType.Water;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(getPosition().x, getPosition().y, getHeight(), getWidth());
	}
}
