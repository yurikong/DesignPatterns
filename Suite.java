package ProjectDesignPatterns;

public class Suite extends Room {
	public Suite() 
	{ 
		description = "Suite";
		count++;
	}
	public int cost() { return 100; }
}
