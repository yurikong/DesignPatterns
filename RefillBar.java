package ProjectDesignPatterns;

public class RefillBar extends Amenities {

	MotelRoom room;
	public RefillBar(MotelRoom room)
	{
		this.room = room;
	}
	public String getType()
	{
		return room.getType() + ", RefillBar";
	}
	public double cost()
	{
		return 5 + room.cost();
	}
}
