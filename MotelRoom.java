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

public abstract class MotelRoom {
	//Type refers to the room type such as "Deluxe"
	protected String type = "Unknown";
	protected int roomNumber;
	protected RoachColony guest;
	//Returns the type of room
	public String getType() 
	{
		return type;
	}
	public abstract double cost();
	//Room number setter
	public void setRoomNumber(int roomNumber) 
	{
		this.roomNumber = roomNumber;
	}
	//Room number getter
	public int getRoomNumber() 
	{
		return roomNumber; 
	}
	//Guest setter
	public void setGuest(RoachColony rc) 
	{
		guest = rc; 
	}
	//Guest Getter
	public RoachColony getGuest() 
	{
		return guest; 
	}
	//Return the room type and its cost as a string
	public String toString() 
	{
		return getType() + " " + cost(); 
	}
}
