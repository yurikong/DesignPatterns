package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoomFactory {
	
	public RoomFactory() {}
	public Room createRoom(String type, ArrayList<String> amenities) {
		Room room = null;
		if(type.equals("regular room"))
			room = new RegularRoom();
		else if(type.equals("deluxe room"))
			room = new DeluxeRoom();
		else if(type.equals("suite"))
			room = new Suite();
		else
			return null;
		if(amenities.contains("food bar"))
			room = new FoodBar(room);
		if(amenities.contains("spa"))
			room = new Spa(room);
		if(amenities.contains("food bar autorefill"))
			room = new FoodBarAutorefill(room);
		if(amenities.contains("spray resistant shower"))
			room = new SprayResistantShower(room);
		return room;
	}
}
