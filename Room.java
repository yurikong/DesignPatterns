package ProjectDesignPatterns;

public abstract class Room {
	private String description = "unknown room";
	public String getDescription() { return description; }
	public abstract int cost();
}
