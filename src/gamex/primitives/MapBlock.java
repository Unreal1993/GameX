package gamex.primitives;

import gamex.helpers.Paintable;

public abstract class MapBlock implements Paintable {

	// TODO: Find a better place for these methods - they don't really belong here
	public int getHeight() {
		return 32;
	}

	public int getWidth() {
		return 32;
	}

}
