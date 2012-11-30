package gamex.gameobjects;

import gamex.enums.MapBlockType;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


public class MapBlock{
	private int height;
	private int width;
	private Point position;
	public MapBlockType blockType;
	public MapBlock(int width,int height,Point position,MapBlockType bType) {
		this.position = position;
		this.width = width;
		this.height = height;
		this.blockType = bType;
	}
	public void paint(Graphics g) {
		Color previousColor = g.getColor();
		g.setColor(blockType.getBlockColor());
		g.fillRect(getX(), getY(), width, height);
		g.setColor(previousColor);
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
	
	public int getX() {
		return position.x;
	}
	public int getY() {
		return position.y;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(Point position) {
		this.position = position;
	}
}
