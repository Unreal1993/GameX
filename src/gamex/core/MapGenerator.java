package gamex.core;

import gamex.primitives.GrassMapBlock;
import gamex.primitives.Map;
import gamex.primitives.WaterMapBlock;

public class MapGenerator {

	public Map generate() {
		Map map = new Map();
		for (int i = 0; i < 256; i++)
			if (Math.random() < 0.8)
				map.addBlock(new GrassMapBlock());
			else
				map.addBlock(new WaterMapBlock());
		return map;
	}

}
