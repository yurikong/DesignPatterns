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

public class Deluxe extends MotelRoom
{
	/**
	 * Creates a new room of type "Deluxe".
	 */
	public Deluxe()
	{
		type = "Deluxe";
	}
	/**
	 * Returns the cost of a "Deluxe" room.
	 * @return cost of this room.
	 */
	public double cost()
	{
		return 75;
	}
}
