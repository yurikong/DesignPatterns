package ProjectDesignPatterns;

public class FoodBarAutorefill extends Amenities {
	Room room;
	public FoodBarAutorefill(Room room) {
		this.room = room;
	}
	public String getDescription() {
		return room.getDescription() + ", food bar autorefill";
	}
	public int cost() {
		return room.cost() + 5;
	}
}
