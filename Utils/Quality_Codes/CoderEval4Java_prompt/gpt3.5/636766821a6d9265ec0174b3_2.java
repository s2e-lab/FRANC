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
			// TODO: implement the filter logic for the incoming message
        // Replace the return statement with your own logic
		return msg;
	}

	/**
	 * The method responsible for broadcasting the message to all listeners.
	 * @param msg
	 */
	public void broadcast(Object msg){
		//Invoke the filter
		Object filteredMsg = filter(msg);
		//TODO: implement the broadcast logic for the filtered message
		//Replace the below print statement with actual broadcast logic
		System.out.println(filteredMsg + " broadcasted to all listeners!");
	}
}

/**
 * Example usage of the DefaultBroadcaster class
 */