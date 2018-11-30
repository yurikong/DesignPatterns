package ProjectDesignPatterns;

public abstract class Room {
	protected String description = "Unknown";
	public String getDescription() { return description; }
	public abstract int cost();
}
