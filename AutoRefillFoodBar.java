package ProjectDesignPatterns;

public class AutoRefillFoodBar extends RoomDecorator {
	Room room;
	public AutoRefillFoodBar(Room room) {
		this.room = room;
	}
	public String getDescription() {
		return room.getDescription() + ", auto-refill of food bar";
	}
	public int cost() {
		return room.cost() + 5;
	}
}
