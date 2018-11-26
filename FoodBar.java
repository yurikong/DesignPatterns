package ProjectDesignPatterns;

public class FoodBar extends RoomDecorator {
	Room room;
	public FoodBar(Room room) {
		this.room = room;
	}
	public String getDescription() {
		return room.getDescription() + ", food bar";
	}
	public int cost() {
		return room.cost() + 10;
	}
}
