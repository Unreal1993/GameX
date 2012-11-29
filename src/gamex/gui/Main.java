/**
 * Name    : Main.java
 * Project : GameX
 * Author  : Robert M Hubinsky <r.hubinsky@hotmail.com>
 * Created : 28.11.2012
 */
package gamex.gui;

import gamex.core.GameManager;
import gamex.core.MapGenerator;
import gamex.primitives.Map;

import javax.swing.*;

public class Main extends JDialog {

	private final int squareSize = 500;

	public static void main(String[] args) {
		Main dialog = new Main();
		try {
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Map map = new MapGenerator().generate();

		GameManager gameManager = new GameManager(dialog.getGraphics(), 80);
		gameManager.setMap(map);

	}

	public Main() {
		setBounds(100, 100, squareSize, squareSize);
	}

}
