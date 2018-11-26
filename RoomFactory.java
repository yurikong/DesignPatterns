package ProjectDesignPatterns;

public class RoomFactory {
	public Room createRoom(String type) {
		Room newRoom = null;
		if (type.equals("suite")){
		    return new Suite();
		}else if (type.equals("deluxe")){
		    return new Deluxe();
		}else if (type.equals("regular")){
		    return new Regular();
		}else
		    return null;
	}
}

