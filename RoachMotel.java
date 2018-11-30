package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoachMotel {
	private static final int CAPACITY = 10;
	private static RoachMotel instance;
	private static RoomFactory factory;
	private static ArrayList<Room> rooms;
	
	private RoachMotel() {}
	public static RoachMotel getInstance() {
		synchronized(RoachMotel.class) {
			if(instance == null)
				instance = new RoachMotel();
		}
		return instance;
	}
	public void createRooms() {
		rooms = new ArrayList<>(CAPACITY);
	}
	public String toString() {
		return "";
	}
}
