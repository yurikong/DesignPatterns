package ProjectDesignPatterns;

public class FoodBar extends Amenities {
	
	MotelRoom room;
	public FoodBar(MotelRoom room)
	{
		this.room = room;
	}
	public String getType()
	{
		return room.getType() + ", FoodBar";
	}
	public double cost()
	{
		return 10 + room.cost();
	}
}
