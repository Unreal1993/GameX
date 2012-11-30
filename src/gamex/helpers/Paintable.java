package gamex.helpers;

import java.awt.*;

// An interface that could be used to generalise drawing code
public interface Paintable {

	// TODO: find an alternative to passing x and y values 
	// We can use this for UI elements or splash screens
	public void paint(Graphics g, int x, int y);

}
