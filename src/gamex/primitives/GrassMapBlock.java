package gamex.primitives;

import java.awt.*;

public class GrassMapBlock extends MapBlock {

	@Override
	public void paint(Graphics g, int x, int y) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, getHeight(), getWidth());
	}

}
