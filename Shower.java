package ProjectDesignPatterns;

public class Shower extends Amenities {

	MotelRoom room;
	public Shower(MotelRoom room) 
	{
		this.room = room; 
	}
	public String getType() 
	{
		return room.getType() + ", Shower"; 
	}
	public double cost() 
	{
		return 25 + room.cost(); 
	}
}
