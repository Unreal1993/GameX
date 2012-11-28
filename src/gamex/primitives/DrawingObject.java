/**
  * Name    : DrawingObject.java
  * Project : GameX
  * Author  : Robert M Hubinsky <r.hubinsky@hotmail.com>
  * Created : 28.11.2012
  */
package gamex.primitives;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class DrawingObject extends JLabel{
	private BufferedImage image;

    public void paint() {
        paint(getGraphics());
    }

	public void paint(Graphics g) {
        super.paint(g);
        if (image != null)
            g.drawImage(image, 0, 0, null);
	}

	public void setDrawImage(BufferedImage image) {
		this.image = image;
		this.repaint();
	}
}
