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

public interface Subject 
{
	/**
	 * Adds an observer to the notification list
	 * @param o the observer that will receive notification
	 */
	public void registerObserver(Observer o);
	/**
	 * Removes an observer from the notification list
	 * @param o the observer that will stop receiving notification
	 */
	public void removeObserver(Observer o);
	/**
	 * Notifies all members in the notification list
	 */
	public void notifyObservers();
}
