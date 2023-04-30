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
			// TODO: Implement the filter method to be used with the BroadcastFilter interface.
// In this implementation, the method simply returns the original message.
		return msg;
	}
	
	/**
	 * Broadcasts a message to a list of receivers after filtering.
	 * @param msg
	 * @param receivers
	 * @param filter
	 */
	public void broadcast(Object msg, List<Object> receivers, BroadcastFilter filter){
// TODO: Implement the broadcast method to send the message to each receiver after filtering.
		Iterator<Object> itr = receivers.iterator();
		while(itr.hasNext()) {
			Object receiver = itr.next();
			Object filteredMsg = filter.filter(receiver, msg);
			sendMessage(receiver, filteredMsg);
		}
	}
	
	/**
	 * Sends a message to a given receiver.
	 * @param receiver
	 * @param msg
	 */
	protected void sendMessage(Object receiver, Object msg){
// TODO: Implement the sendMessage method to send the message to the given receiver.
		System.out.println("Sending message to receiver " + receiver.toString() + ": " + msg.toString());
	}
}

/**
 * Interface for a filter to be used with the DefaultBroadcaster class.
 */
interface BroadcastFilter{
	/**
	 * Filters a message before broadcasting.
	 * @param receiver
	 * @param msg
	 * @return
	 */
	Object filter(Object receiver, Object msg);
}

/**
 * Sample implementation of the BroadcastFilter interface.
 * Filters and modifies the message by appending "Hello " to the beginning of the message.
 */
class SampleFilter implements BroadcastFilter{
	public Object filter(Object receiver, Object msg){
		String message = (String)msg;
		message = "Hello " + message;
		return message;
	}
}

/**
 * Main class to demonstrate the usage of the DefaultBroadcaster class and the BroadcastFilter interface.
 */