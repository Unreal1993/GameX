/**
 * Name    : Main.java
 * Project : GameX
 * Author  : Robert M Hubinsky <r.hubinsky@hotmail.com>
 * Created : 28.11.2012
 */
package gamex.gui;

import gamex.core.GameManager;
import gamex.primitives.DrawingObject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JDialog {

	private int squareSize = 500;
	private static GameManager gameManager;
	private static DrawingObject drawingObject = new DrawingObject();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Main dialog = new Main();
		try {
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		gameManager = new GameManager(drawingObject, 80);

	}

	/**
	 * Create the dialog.
	 */
	public Main() {
		setBounds(100, 100, squareSize, squareSize);

		// Put together an image to draw for the drawingObject
		BufferedImage image = new BufferedImage(32, 32,
				BufferedImage.TYPE_INT_RGB);
		image.getGraphics().drawRect(0, 0, 32, 32);
		drawingObject.setDrawImage(image);
		add(drawingObject);
	}

}
