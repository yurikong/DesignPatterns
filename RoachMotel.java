package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoachMotel {
    private RoachMotel() {
		rooms = new ArrayList<Room>(capacity);
		vacant = true;
	}
    
	private static RoachMotel first_instance;
	public ArrayList<Room> rooms;
	private static boolean vacant;
	private static int capacity = 10;
	public static RoachMotel getInstance() {
		if(first_instance == null)
			first_instance = new RoachMotel();
		return first_instance;
	}
       // creates as many regular roomsas needed, 2 deluxe and 1 suite (All these can be changed or suppressed as you will)
    public ArrayList roomallocator(){
        RoomFactory room=new RoomFactory();
        
        for (int i=0; i<capacity-3;i++)
            this.rooms.add(room.createRoom("regular"));   
        
        for (int i=0; i<2;i++)
            this.rooms.add(room.createRoom("deluxe"));   
        
        this.rooms.add(room.createRoom("suite"));
        return this.rooms;
        
    }
	public String isFull(){
            if (rooms.size()==0)
                return "No vancancy, please enroll the waitlist";
            else
                return "Vacancy";
	}
        
}

