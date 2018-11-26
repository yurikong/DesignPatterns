package ProjectDesignPatterns;

public abstract class Room {
	String description = "unknown room";
	public String getDescription() { return description; }
	public abstract int cost();
}
