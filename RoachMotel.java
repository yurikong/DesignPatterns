package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoachMotel {
    RoachMotel() {
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
     
        
    public ArrayList roomallocator(){
        RoomFactory room=new RoomFactory();
        
        for (int i=0; i<capacity-3;i++)
            this.rooms.add(room.createRoom("regular"));
        
        for (int i=0; i<2;i++)
            this.rooms.add(room.createRoom("deluxe")); 
        
        this.rooms.add(room.createRoom("suite"));
        
        for (int i=0;i<capacity;i++){
            this.rooms.get(i).setRoom_number(i+100);
        }
        return this.rooms;
        
    }
    
    public String printRoomsType(){
        return rooms.toString();
    }
    
	public String isFull(){
            if (rooms.size()==0)
                return "No vancancy, please enroll the waitlist";
            else
                return "Vacancy";
	}
        
}
