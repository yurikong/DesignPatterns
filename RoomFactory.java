package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoomFactory {

	public RoomFactory() {}
	public MotelRoom prepareRoom(RoachColony rc, String type, ArrayList<String> amenities, int roomNumber)
	{
		MotelRoom room = null;
		switch(type)
		{
		case("Regular"): room = new Regular(); break;
		case("Deluxe"): room = new Deluxe(); break;
		case("Suite"): room = new Suite(); break;
		default: return null;
		}
		if(amenities.contains("FoodBar"))
			room = new FoodBar(room);
		if(amenities.contains("Spa"))
			room = new Spa(room);
		if(amenities.contains("RefillBar"))
			room = new RefillBar(room);
		if(amenities.contains("Shower"))
			room = new Shower(room);
		room.setGuest(rc);
		room.setRoomNumber(roomNumber);
		return room;
	}
}
