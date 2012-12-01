package gamex.gameobjects;

import gamex.enums.MapBlockType;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class MapBlock {
	public MapBlockType blockType;
	private BufferedImage image;
	public MapBlock(MapBlockType blockType) {
		this.blockType = blockType;
	}
	public BufferedImage paint() {
		if (image != null) {
			return image;
		}
		image = getNewBufferedImage();
		Graphics g = image.getGraphics();
		g.setColor(blockType.getColor());
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		return image;
	}
	public int getDimension() {
		return 20;
	}
	private BufferedImage getNewBufferedImage() {
		return new BufferedImage(getDimension(), getDimension(), BufferedImage.TYPE_INT_RGB);
	}
}
