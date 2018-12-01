package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoachMotel {

	private static RoachMotel instance;
	private RoomFactory factory;
	private ArrayList<MotelRoom> rooms;
	private ArrayList<Integer> availableRooms;
	private int CAPACITY = 5;
	private RoachMotel()
	{
		factory = new RoomFactory();
	}
	private boolean isFull()
	{
		return rooms.size() == CAPACITY;
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
	public MotelRoom checkIn(RoachColony rc, String type, ArrayList<MotelRoom> amenities)
	{
		if(isFull())
		{
			// add to waitlist
		}
	}
	public double checkOut(MotelRoom room, int numberOfDays)
	{
		
	}
	public String toString()
	{
		
	}
}
