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

public class RoachColony implements Observer{

	private String name;
	private int popu;
	private double rate;
	private ArrayList<String> amenities;
	public RoachColony(String name, int popu, double rate)
	{
		this.name = name;
		this.popu = popu;
		this.rate = rate;
	}
	public void party()
	{
		popu += (int)Math.round(popu * rate);
		if(amenities.contains("Shower"))
			popu *= 0.25;
		else
			popu *= 0.5;
	}
	public void setPopu(int popu)
	{
		this.popu = popu;
	}
	public String getName()
	{ 
		return name; 
	}
	public void setAmenities(ArrayList<String> amenities)
	{
		this.amenities = amenities;
	}
	public void update()
	{
		System.out.println(name + " received the notification from the only motel in town.");
	}
	public String toString() 
	{
		return name + " " + popu; 
	}
}
