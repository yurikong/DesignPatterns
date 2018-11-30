package ProjectDesignPatterns;

public abstract class MotelRoom {
	
	protected String type = "Unknown";
	protected int roomNumber;
	public String getType() { return type; }
	public abstract double cost();
	public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
	public int getRoomNumber() { return roomNumber; }
}
