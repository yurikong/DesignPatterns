package ProjectDesignPatterns;

public abstract class Room {
	private int room_number;
    private int foodbar=10;
    private int spa=20;
    private int autorefill=5;
    private int spray_shower=25;
    private String type;

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public int getFoodbar() {
        return foodbar;
    }

    public void setFoodbar(int foodbar) {
        this.foodbar = foodbar;
    }

    public int getSpa() {
        return spa;
    }

    public void setSpa(int spa) {
        this.spa = spa;
    }

    public int getAutorefill() {
        return autorefill;
    }

    public void setAutorefill(int autorefill) {
        this.autorefill = autorefill;
    }

    public int getSpray_shower() {
        return spray_shower;
    }

    public void setSpray_shower(int spray_shower) {
        this.spray_shower = spray_shower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

	
}
