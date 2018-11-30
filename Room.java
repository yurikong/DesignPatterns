package ProjectDesignPatterns;

public abstract class Room {
	protected String description = "Unknown";
	protected static int count = 100;
	protected int roomNumber = count;
	public String getDescription() { return description; }
	public int getRoomNumber() { return roomNumber; }
	public abstract int cost();
}
