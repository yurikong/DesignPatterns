package ProjectDesignPatterns;

public class Tester {

	public static void main(String[] args)
	{
		RoomFactory factory = new RoomFactory();
        RoachMotel motel = new RoachMotel();
        
        motel.roomallocator();
        System.out.println(motel.printRoomsType());
        System.out.println( motel.rooms.get(0).getPrice());
        motel.rooms.get(0).getSpa();
        System.out.println( motel.rooms.get(0).getPrice());
	}
}
