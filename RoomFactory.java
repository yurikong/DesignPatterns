/* Jianqiang Du, Matthew Berrios, Ignacio Saenz de Navarrete Munar, Cesar Gonzalez
 * December 5, 2018
 * Purpose: This program simulates a roach motel that has different types of rooms
 * 			that have complimentary amenities by choice. Each customer is a RoachColony.
 * 			The motel allows customers to party and update its data. It utilizes
 * 			4 design patterns: Singleton, Factory, Decorator, and Observer patterns.
 * Inputs:	Customer name, population, growth rate. Room type, amenities.
 * 			Numbers of days of stay.
 * Outputs:	Information of occupied rooms and available rooms.
 * 			Customer information (name, population).
 * 			Room costs.
 * 			Waitlist of customers.
 */
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
