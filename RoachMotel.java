package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoachMotel {
	RoomFactory factory;
	private RoachMotel() {
		factory = new RoomFactory();
	}
	private static RoachMotel instance;
	public static RoachMotel getInstance() {
		synchronized(RoachMotel.class) {
			if(instance == null)
				instance = new RoachMotel();
		}
		return instance;
	}
	
}
