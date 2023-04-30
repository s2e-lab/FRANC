import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DefaultBroadcaster{
	/** 
	 * Invoke the  {@link BroadcastFilter}
	 * @param msg
	 * @return
	 */
	
	protected Object filter(Object msg){
			// Code for the filter method goes here
// You need to implement the BroadcastFilter interface and create an object of that class to filter the message

		return msg;
	}

	/**
	 * Distribute the message to all the registered subscribers
	 * @param msg
	 */
	
	public void broadcast(Object msg){
		msg = filter(msg); // Filter the message

		// Code for distributing the message to all the registered subscribers goes here

	}
}

// You can create a BroadcastFilter interface and implement it
// interface BroadcastFilter{
//    public Object filter(Object msg);
// }  

// You can also create a Subscriber interface and implement it
// interface Subscriber{
//    public void receive(Object msg);
// } 

// And implement a SubscriberList class that keeps track of all the registered subscribers