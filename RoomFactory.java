package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoomFactory {

	public RoomFactory() {}
	public MotelRoom prepareRoom(String type, ArrayList<String> amenities)
	{
		MotelRoom room = null;
		if(type.equals("Regular"))
			room = new Regular();
		else if(type.equals("Deluxe"))
			room = new Deluxe();
		else if(type.equals("Suite"))
			room = new Suite();
		else
			return null;
		if(amenities.contains("FoodBar"))
			room = new FoodBar(room);
		if(amenities.contains("Spa"))
			room = new Spa(room);
		if(amenities.contains("RefillBar"))
			room = new RefillBar(room);
		if(amenities.contains("Shower"))
			room = new Shower(room);
		return room;
	}
}
