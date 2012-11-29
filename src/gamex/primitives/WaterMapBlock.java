package gamex.primitives;

import java.awt.*;

public class WaterMapBlock extends MapBlock {

	@Override
	public void paint(Graphics g, int x, int y) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, getHeight(), getWidth());
	}

}
