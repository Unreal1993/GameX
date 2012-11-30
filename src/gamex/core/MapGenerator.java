package gamex.core;

import java.awt.Point;

import gamex.gameobjects.*;
import gamex.primitives.Map;

public class MapGenerator {

	public Map generate() {
		Map map = new Map();
		for(int i = 0;i<Math.round(500/20);i++) {
			for(int j = 0;j<Math.round(500/20);j++) {
				double random = Math.random();
				if(random < 0.7)
					map.addBlock(new MapBlockGrass(20,20,new Point(i*20,j*20)));
				else
					map.addBlock(new MapBlockWater(20,20,new Point(i*20,j*20)));
			}	
		}
		return map;
	}

}
