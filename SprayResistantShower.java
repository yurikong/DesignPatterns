package ProjectDesignPatterns;

public class SprayResistantShower extends RoomDecorator {
	Room room;
	public SprayResistantShower(Room room) {
		this.room = room;
	}
	public String getDescription() {
		return room.getDescription() + ", spray resistant shower";
	}
	public int cost() {
		return room.cost() + 25;
	}
}
