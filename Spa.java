package ProjectDesignPatterns;

public class Spa extends Amenities {

	MotelRoom room;
	public Spa(MotelRoom room) 
	{
		this.room = room; 
	}
	public String getType()
	{
		return room.getType() + ", Spa"; 
	}
	public double cost() 
	{
		return 20 + room.cost(); 
	}
}
