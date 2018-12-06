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
	/**
	 * Returns the type of room.
	 * @return type of room
	 */
	public String getType() 
	{
		return type;
	}
	/**
	 * Returns the cost of room.
	 * @return cost of room
	 */
	public abstract double cost();
	/**
	 * Room number setter.
	 * Sets the room number.
	 * @param roomNumber room number
	 */
	public void setRoomNumber(int roomNumber) 
	{
		this.roomNumber = roomNumber;
	}
	/**
	 * Room number getter.
	 * Gets the room number.
	 * @return room number
	 */
	public int getRoomNumber() 
	{
		return roomNumber; 
	}
	/**
	 * Guest setter. "Guest" refers to a RoachColony.
	 * Assigns "Guest" to the room.
	 * @param rc RoachColony that occupies this room.
	 */
	public void setGuest(RoachColony rc) 
	{
		guest = rc; 
	}
	/**
	 * Guest getter. "Guest" refers to a RoachColony.
	 * Returns "Guest" of the room.
	 * @return RoachColony that occupies this room.
	 */
	public RoachColony getGuest() 
	{
		return guest; 
	}
	/**
	 * Returns the room type and its cost as a string.
	 * @return room information and cost
	 */
	public String toString() 
	{
		return getType() + " " + cost(); 
	}
}
