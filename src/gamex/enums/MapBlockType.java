package gamex.enums;

import java.awt.Color;

public enum MapBlockType {
	Blank(0,Color.WHITE),
	Grass(1,Color.GREEN),
	Water(2,Color.BLUE);
	
	private int id;
	private Color color; // This can be used or we can load a texture here
	private MapBlockType(int id,Color color) {
		this.id = id;
		this.color = color;
	}
	public int getID() {
		return id;
	}
	public Color getColor() {
		return color;
	}
}
