import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TelnetAppender{
	/** 
	 * sends a message to each of the clients in telnet-friendly output. 
	 */
	
	public synchronized void send(final String message){
		for(final String client : clients.keySet()){
			try{
				System.out.println("Sending message to client " + client);
				client.write(message);
				System.out.println("Sent " + message);
			}
			catch(IOException e){
				System.err.println("Could not send message to client" + e.getMessage() );
				e.printStackTrace();
			}
		}
	}

    public synchronized String newServerMessage(final String message){
	        
}
}