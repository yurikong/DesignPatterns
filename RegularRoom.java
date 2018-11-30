package ProjectDesignPatterns;

public class RegularRoom extends Room {
	public RegularRoom() 
	{
		description = "Regular"; 
		count++;
	}
	public int cost() { return 50; }
}
