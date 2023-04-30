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
			// Implement your code here
		return msg;
	}
	
	/**
	 * Implement the functionality of broadcasting message to all the registered clients.
	 * This is the functionality which will be executed infinitely.
	 * 
	 *  - Invoke the {@link BroadcastFilter#filter(Object)}  for each message to be broadcasted.
	 *  - Broadcast the message to each {@link Client} which is registered using {@link Client#publish(Object)} method.
	 *  - If any exception occur while broadcasting message to any client, remove that client from the list of registered clients.
	 *    Print the client host name and port number. Finally close the stream which was used to communicate with that client.
	 *    
	 *  Note : 
	 *  - Use Thread.sleep(5000) to wait for 5 seconds between two consecutive broadcasting.
	 *  - Use list of Client instances to store the registered clients.
	 *  - Use try-catch block for every client communication to handle exceptions. 
	 */
	protected void broadcast(){
           // Implement your code here
		while(true){
			try{
				Thread.sleep(5000);
				Object filteredMsg = filter("Hello World!"); //considering Hello World! as message to be broadcasted
				for(Client client : clients){
					try{
						client.publish(filteredMsg);
					}catch(Exception e){
						System.out.println("Error while broadcasting message to client "+client.getHostName()+" "+client.getPortNumber());
						clients.remove(client);
						client.close();
					}
				}
			}catch(Exception e){
				System.out.println("Error in broadcasting message");
			}
		}     
	}
	
	/**
	 * Implement the functionality of registering a client to the list of clients.
	 * Store the registered clients to the List of clients.
	 * Use {@link Client#setFilter(BroadcastFilter)} method to set the filter of the obtained client instance.
	 * @param clientHost
	 * @param clientPort
	 * @return the obtained Client instance.
	 * 		   If any exception occur while establishing the connection with the peer, simply return null.
	 * 
	 */
	protected Client acceptClient(String clientHost, int clientPort){
                // Implement your code here
}
}