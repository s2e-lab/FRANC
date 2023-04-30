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
			// Here is an example implementation of a BroadcastFilter.
// This can be replaced with the actual implementation that the DefaultBroadcaster is intended to use.

// class MyBroadcastFilter implements BroadcastFilter {
//     public Object filter(Object msg) {
//         // filter logic here
//     }
// }

// Uncomment the above code and replace the filter method below with your actual implementation.

		// MyBroadcastFilter filter = new MyBroadcastFilter();
        // return filter.filter(msg);
		
		return msg; // Default behavior - no filtering
	}
	
	
	/**
	 * Send the message to all the receivers
	 * @param msg
	 */
	
	public void broadcast(Object msg){
		// Apply the filter
		Object filteredMsg = filter(msg);
		
		// Broadcast the message to all receivers
		// Example implementation
		// for(Receiver r : receivers){
		//   r.receive(filteredMsg)
		// }
	}
	
}


interface BroadcastFilter{
	
	/**
	 * Filter the message before broadcasting
	 * @param msg
	 * @return
	 */
	
	public Object filter(Object msg);
	
}


interface Receiver{
	
	/**
	 * Receive the broadcast message
	 * @param msg
	 */
	
	public void receive(Object msg);
	
}