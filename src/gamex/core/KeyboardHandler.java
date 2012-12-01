package gamex.core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class KeyboardHandler implements KeyListener {

	private HashMap<Integer, Boolean> pressedKeys = new HashMap<Integer, Boolean>();

	@Override
	public void keyTyped(KeyEvent keyEvent) {
	}

	@Override
	public void keyPressed(KeyEvent keyEvent) {
		pressedKeys.put(keyEvent.getKeyCode(), true);
	}

	@Override
	public void keyReleased(KeyEvent keyEvent) {
		pressedKeys.put(keyEvent.getKeyCode(), null);
	}

	public boolean isKeyPressed(int keyCode) {
		return (pressedKeys.get(keyCode) != null);
	}

}
