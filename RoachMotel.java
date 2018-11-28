package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoachMotel {
	private static RoachMotel instance;
	private static RoomFactory factory;
	private static int capacity = 20;
	private static ArrayList<Room> rooms;
	private RoachMotel() {}
	public static RoachMotel getInstance() {
		synchronized(RoachMotel.class) {
			if(instance == null) {
				instance = new RoachMotel();
				factory = new RoomFactory();
				rooms = new ArrayList<>(capacity);
			}
		}
		return instance;
	}
	
}
