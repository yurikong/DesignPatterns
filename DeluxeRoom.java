package ProjectDesignPatterns;

public class DeluxeRoom extends Room {
	public DeluxeRoom() 
	{
		description = "Deluxe"; 
		count++;
	}
	public int cost() { return 75; }
}
