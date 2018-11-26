package ProjectDesignPatterns;

public class Spa extends RoomDecorator {
	Room room;
	public Spa(Room room) {
		this.room = room;
	}
	public String getDescription() {
		return room.getDescription() + ", spa";
	}
	public int cost() {
		return room.cost() + 20;
	}
}
