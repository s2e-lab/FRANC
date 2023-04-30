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
			// Define your implementation for the filter method here.
// This method takes an Object named msg as input and returns an Object as output.

// Example:
// If your filter just capitalizes the input string, use this code:
// String filteredMsg = ((String) msg).toUpperCase();
// return filteredMsg;

// If your filter does not modify the input message, return the input message as is.
			return msg;
	}
	
	/**
	 * Broadcasts an {@link Object} to all the interested {@link Subscriber}
	 * @param msg
	 * @return
	 */
	
	protected boolean broadcast(Object msg){
		// Implement your logic for broadcasting the message to all interested subscribers
		// Return true if broadcast was successful, false otherwise
		return true;
	}	
}


interface Subscriber{
	public void receive(Object msg);
}


interface BroadcastFilter{
	public Object filter(Object msg);
}


class ConcreteBroadcaster extends DefaultBroadcaster{
	// Define your implementation for the filter method here
	// This method should call the {@link BroadcastFilter} if provided, and return the result or
	// call the parent class filter method for default filtering
	
	@Override
	protected Object filter(Object msg){
		// Check if a filter is registered
		if(filterImpl != null) {
			return filterImpl.filter(msg);
		}
		// If no filter is registered, call the parent class filter method
		return super.filter(msg);
	}
	
	// Define your implementation for the broadcast method here
	// This method should call the filter method and then send the message to all subscribers
	
	@Override
	protected boolean broadcast(Object msg){
		// Filter the message first
		Object filteredMsg = filter(msg);
		
		// Send the message to all subscribers
		for(Subscriber subscriber : subscribers){
			subscriber.receive(filteredMsg);
		}
		
		return true;
	}
	
	private Set<Subscriber> subscribers = new HashSet<Subscriber>();
	private BroadcastFilter filterImpl = null;
	
	public void addSubscriber(Subscriber subscriber){
		// Add the new subscriber
		subscribers.add(subscriber);
	}
	
	public void removeSubscriber(Subscriber subscriber){
		// Remove the subscriber
		subscribers.remove(subscriber);
	}
	
	public void setFilter(BroadcastFilter filter){
		this.filterImpl = filter;
	}
}


class ConcreteSubscriber implements Subscriber{
	// Define your implementation for the receive method here
	// This method is called when a broadcast is received, and it receives
}