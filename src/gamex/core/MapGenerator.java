package gamex.core;

import java.awt.Point;

import gamex.enums.MapBlockType;
import gamex.gameobjects.*;
import gamex.primitives.Map;

public class MapGenerator {

	public Map generate() {
		Map map = new Map();
		for(int i = 0;i<Math.round(500/20);i++) {
			for(int j = 0;j<Math.round(500/20);j++) {
				double random = Math.random();
				if(random < 0.8) {
					map.addBlock(new MapBlock(MapBlockType.Grass));
				}else {
					map.addBlock(new MapBlock(MapBlockType.Water));
				}
			}	
		}
		return map;
	}

}
