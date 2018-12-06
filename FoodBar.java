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

public class FoodBar extends Amenities
{	
	MotelRoom room;
	/**
	 * Adds amenities of a food bar to this room.
	 * @param room this room, to which a food bar is added.
	 */
	public FoodBar(MotelRoom room) 
	{
		this.room = room; 
	}
	/** Returns the type of this room.
	 * @return the type of room and the addition of a food bar as a string
	 */
	public String getType()
	{
		return room.getType() + ", FoodBar"; 
	}
	/** Returns the cost of this room.
	 * @return the cost of this room and the cost of the food bar
	 */
	public double cost()
	{
		return 10 + room.cost(); 
	}
}
