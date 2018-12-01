package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoachMotel {

	private static RoachMotel instance;
	private RoomFactory factory;
	private ArrayList<MotelRoom> rooms;
	private ArrayList<Integer> availableRooms;
	private ArrayList<RoachColony> waitlist;
	private int CAPACITY = 5;
	private boolean isFull;
	private RoachMotel()
	{
		factory = new RoomFactory();
		waitlist = new ArrayList<>();
		isFull = false;
	}
	private boolean isFull()
	{
		isFull = availableRooms.size() == 0 ? true : false;
		return isFull;
	}
	public static RoachMotel getInstance()
	{
		if(instance == null)
			instance = new RoachMotel();
		return instance;
	}
	public void createRooms()
	{
		rooms = new ArrayList<>(CAPACITY);
		availableRooms = new ArrayList<>(CAPACITY);
		for(int i = 101; i < 101 + CAPACITY; i++)
			availableRooms.add(i);
	}
	public MotelRoom checkIn(RoachColony rc, String type, ArrayList<String> amenities)
	{
		System.out.println("available Rooms: " + availableRooms.toString());
		if(isFull())
		{
			waitlist.add(rc);
			System.out.println("waitlist: " + waitlist.toString());
			return null;
		}
		System.out.println("in set amenities: " + amenities.toString());
		int roomNumber = availableRooms.get(0);
		availableRooms.remove(0);
		MotelRoom room = factory.prepareRoom(rc, type, amenities, roomNumber);
		System.out.println(room.toString());
		rooms.add(room);
		isFull();
		return room;
	}
	public double checkOut(MotelRoom room, int numberOfDays)
	{
		// notify waitlist
		double cost = room.cost() * numberOfDays;
		int roomNumber = room.getRoomNumber();
		availableRooms.add(roomNumber);
		System.out.println("room number is: " + roomNumber);
		int index = rooms.indexOf(room);
		rooms.remove(index);
		isFull();
		return cost;
	}
	public String toString()
	{
		String output = "motel: {";
		for(MotelRoom mr : rooms)
			output += mr.getType() + ", " + mr.cost() + "=" + mr.getGuest().toString() + ";";
		output += "} available: " + availableRooms.toString();
		return output;
	}
}
