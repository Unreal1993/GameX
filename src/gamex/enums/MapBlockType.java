package gamex.enums;

public enum MapBlockType {
	Blank(0),
	Grass(1),
	Water(2);
	
	private int blockID;
	private MapBlockType(int blockID) {
		this.blockID = blockID;
	}
	public int getBlockID() {
		return blockID;
	}
}
