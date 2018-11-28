package ProjectDesignPatterns;

public class Spa extends Amenities {
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
