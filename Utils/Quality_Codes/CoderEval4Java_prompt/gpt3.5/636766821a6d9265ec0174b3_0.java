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
			// There is no implementation for the filter method. Should I add a sample implementation?
		return msg;
	}
	
	/**
	 * Broadcast the message to all {@link EndPoint}
	 * @param msg
	 */
	
	public void broadcast(Object msg){
		// Get all EndPoints and broadcast to each of them
		List<EndPoint> endPoints = EndPointRegistry.getInstance().getAllEndPoints();
		for(EndPoint endPoint : endPoints){
			if(endPoint != null){
				try {
					// Invoke BroadcastFilter's filter method to filter the message
					Object filteredMsg = endPoint.getFilter().filter(msg);
					// Call EndPoint's onMessage method to process the filtered message
					endPoint.onMessage(filteredMsg);
				} catch(Exception e) {
					// Log an error in case of any exception
					Logger.error("Error broadcasting message to endpoint" + endPoint, e);
				}
			}
		}
	}
}


/**
* EndPoint maintains {@link BroadcastFilter} and processes messages
*/
