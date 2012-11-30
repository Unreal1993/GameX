package gamex.enums;

import java.awt.Color;

public enum MapBlockType {
	Blank(0,Color.WHITE),
	Grass(1,Color.GREEN),
	Water(2,Color.BLUE);
	
	private int blockID;
	private Color blockColor; // This can be used or we can load a texture here 
	private MapBlockType(int blockID,Color blockColor) {
		this.blockID = blockID;
		this.blockColor = blockColor;
	}
	public int getBlockID() {
		return blockID;
	}
	public Color getBlockColor() {
		return blockColor;
	}
}
