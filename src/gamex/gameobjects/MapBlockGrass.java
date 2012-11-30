package gamex.gameobjects;

import gamex.enums.MapBlockType;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class MapBlockGrass extends MapBlock {
	/**
	 * @param width
	 * @param height
	 * @param position
	 */
	public MapBlockGrass(int width, int height, Point position) {
		super(width, height, position);
		this.blockType = MapBlockType.Grass;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(getPosition().x, getPosition().y, getHeight(), getWidth());
	}
}
