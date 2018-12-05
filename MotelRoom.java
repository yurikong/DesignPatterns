package ProjectDesignPatterns;

public abstract class MotelRoom {
	
	protected String type = "Unknown";
	protected int roomNumber;
	protected RoachColony guest;
	public String getType() 
	{
		return type;
	}
	public abstract double cost();
	public void setRoomNumber(int roomNumber) 
	{
		this.roomNumber = roomNumber;
	}
	public int getRoomNumber() 
	{
		return roomNumber; 
	}
	public void setGuest(RoachColony rc) 
	{
		guest = rc; 
	}
	public RoachColony getGuest() 
	{
		return guest; 
	}
	public String toString() 
	{
		return getType() + " " + cost(); 
	}
}
