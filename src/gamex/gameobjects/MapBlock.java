package gamex.gameobjects;

import gamex.enums.MapBlockType;
import gamex.helpers.Paintable;

import java.awt.Graphics;
import java.awt.Point;


public class MapBlock{
	private int height;
	private int width;
	private Point position;
	public MapBlockType blockType;
	public MapBlock(int width,int height,Point position) {
		this.position = position;
		this.width = width;
		this.height = height;
		this.blockType = MapBlockType.Blank;
	}
	public void paint(Graphics g) {
		// Use object defined x and y
	}
	/**
	 * @return int height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return int width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return Point position
	 */
	public Point getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(Point position) {
		this.position = position;
	}
}
