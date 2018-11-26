package ProjectDesignPatterns;

public abstract class Room {
<<<<<<< HEAD
	private String description = "unknown room";
	public String getDescription() { return description; }
	public abstract int cost();
=======
    private int room_number;
    private int foodbar=10;
    private int spa=20;
    private int autorefill=5;
    private int spray_shower=25;
    private String type;
    private int price;

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public void getFoodbar() {
        price+=foodbar;
    }

    public void setFoodbar(int foodbar) {
        this.foodbar = foodbar;
    }

    public void getSpa() {
        price+=spa;
    }

    public void setSpa(int spa) {
        this.spa = spa;
    }

    public void getAutorefill() {
        price+=autorefill;
    }

    public void setAutorefill(int autorefill) {
        this.autorefill = autorefill;
    }

    public void getSpray_shower() {
        price+=spray_shower;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String toString (){
        return this.room_number+" is a "+this.type;
    }

    
>>>>>>> parent of 303b89d... Restore Jack's branch
}
