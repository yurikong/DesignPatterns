package ProjectDesignPatterns;

public abstract class MotelRoom {
	//type refers to the room type such as "Deluxe"
	protected String type = "Unknown";
	protected int roomNumber;
	protected RoachColony guest;
	//Returns the room type
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
	//Guest getter
	public RoachColony getGuest() 
	{
		return guest; 
	}
	//Returns the room type and its cost
	public String toString() 
	{
		return getType() + " " + cost(); 
	}
}
