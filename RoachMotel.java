/* Jianqiang Du, Matthew Berrios, Ignacio Saenz de Navarrete Munar, Cesar Gonzalez
 * December 5, 2018
 * Purpose: This program simulates a roach motel that has different types of rooms
 * 			that have complimentary amenities by choice. Each customer is a RoachColony.
 * 			The motel allows customers to party and update its data. It utilizes
 * 			4 design patterns: Singleton, Factory, Decorator, and Observer patterns.
 * Inputs:	Customer name, population, growth rate. Room type, amenities.
 * 			Numbers of days of stay.
 * Outputs:	Information of occupied rooms and available rooms.
 * 			Customer information (name, population).
 * 			Room costs.
 * 			Waitlist of customers.
 */
package ProjectDesignPatterns;

import java.util.ArrayList;

public class RoachMotel implements Subject{

	private static RoachMotel instance;
	private RoomFactory factory;
	private ArrayList<MotelRoom> rooms;
	private ArrayList<Integer> availableRooms;
	private ArrayList<Observer> waitlist;
	private final int CAPACITY = 5; // default capacity of motel
	private boolean isFull;
	/**
	 * Creates the only motel in town.
	 * The motel has a room factory, a waitlist, and a vacancy sign.
	 */
	private RoachMotel()
	{
		factory = new RoomFactory();
		waitlist = new ArrayList<>();
		isFull = false;
	}
	/**
	 * Returns the vacancy status of the motel.
	 * @return true if motel is full
	 */
	private boolean isFull()
	{
		isFull = availableRooms.size() == 0 ? true : false;
		return isFull;
	}
	/**
	 * A reference of the only motel in town.
	 * @return the only motel in town
	 */
	public static RoachMotel getInstance()
	{
		if(instance == null)
			instance = new RoachMotel();
		return instance;
	}
	/**
	 * The motel keeps track of the rooms and the available rooms.
	 * Room numbers start from 101
	 */
	public void createRooms()
	{
		rooms = new ArrayList<>(CAPACITY);
		availableRooms = new ArrayList<>(CAPACITY);
		for(int i = 101; i < 101 + CAPACITY; i++)
			availableRooms.add(i);
	}
	/**
	 * A RoachColony checks in to the next available room.
	 * If there is no available rooms, it will be added to the waitlist.
	 * @param rc RoachColony
	 * @param type type of room
	 * @param amenities a list of amenities that RoachColony wants
	 * @return the next available room
	 */
	public MotelRoom checkIn(RoachColony rc, String type, ArrayList<String> amenities)
	{
		System.out.println("available Rooms: " + availableRooms.toString());
		if(isFull())
		{
			registerObserver(rc);
			System.out.println("waitlist: " + waitlist.toString());
			return null;
		}
		System.out.println("in set amenities: " + amenities.toString());
		int roomNumber = availableRooms.get(0);
		availableRooms.remove(0);
		MotelRoom room = factory.prepareRoom(rc, type, amenities, roomNumber);
		rc.setAmenities(amenities);
		System.out.println(room.toString());
		rooms.add(room);
		isFull();
		return room;
	}
	/**
	 * A RoachColony checks out.
	 * When a RoachColony checks out, notify all members of the waitlist and clear the list.
	 * @param room the room to be checked out
	 * @param numberOfDays how many days of stay
	 * @return total cost of the room
	 */
	public double checkOut(MotelRoom room, int numberOfDays)
	{
		notifyObservers();
		double cost = room.cost() * numberOfDays;
		int roomNumber = room.getRoomNumber();
		System.out.println("room number is: " + roomNumber);
		int index = rooms.indexOf(room);
		rooms.remove(index);
		availableRooms.add(roomNumber);
		isFull();
		return cost;
	}
	/**
	 * Adds a customer to the waitlist
	 */
	public void registerObserver(Observer o)
	{
		waitlist.add(o);
	}
	/**
	 * Removes a member from the waitlist 
	 */
	public void removeObserver(Observer o)
	{
		waitlist.remove(o);
	}
	/**
	 * Notifies all members of the waitlist and clear the list
	 */
	public void notifyObservers()
	{
		for(Observer o : waitlist)
			o.update();
		waitlist.clear();
	}
	/**
	 * Returns relevant information of the motel.
	 * @return motel information
	 */
	public String toString()
	{
		String output = "motel: {";
		for(MotelRoom mr : rooms)
			output += mr.getType() + ", " + mr.cost() + "=" + mr.getGuest().toString() + ";";
		output += "} available: " + availableRooms.toString();
		return output;
	}
}
