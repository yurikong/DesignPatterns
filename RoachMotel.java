package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoachMotel {

	private RoachMotel() {
		rooms = new ArrayList<RoomFactory>(capacity);
		vacant = true;
	}
	private static RoachMotel instance;
	private static ArrayList<RoomFactory> rooms;
	private static boolean vacant;
	private static int capacity = 10;
	public static RoachMotel getInstance() {
		if(instance == null)
			instance = new RoachMotel();
		return instance;
	}
	
}
