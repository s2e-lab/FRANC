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
			// Add implementation of filter method here

		return msg;
	}
	
	/** 
	 * Broadcasts the message to all listeners
	 * @param msg
	 */
	public void broadcast(Object msg){
		// Add implementation of broadcast method here
	}
	
	/** 
	 * Adds a listener to the broadcaster
	 * @param listener
	 */
	public void addListener(BroadcastListener listener){
		// Add implementation of addListener method here
	}
	
	/** 
	 * Removes a listener from the broadcaster
	 * @param listener
	 */
	public void removeListener(BroadcastListener listener){
		// Add implementation of removeListener method here
	}
	
}
 
interface BroadcastFilter {
	/**
	 * This method is used to filter out messages based on a certain criteria.
	 * @param msg
	 * @return
	 */
	public Object filter(Object msg);
}
 
interface BroadcastListener{
	/**
	 * This method is called when a message is broadcasted.
	 * @param msg
	 */
	public void onBroadcast(Object msg);
}