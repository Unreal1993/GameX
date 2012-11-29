package gamex.primitives;

import java.util.ArrayList;
import java.util.List;

public class Map {

	private List<MapBlock> blocks;

	public Map() {
		blocks = new ArrayList<MapBlock>();
	}

	public List<MapBlock> getBlocks() {
		return blocks;
	}

	public void addBlock(MapBlock block) {
		blocks.add(block);
	}

}
