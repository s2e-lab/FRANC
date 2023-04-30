import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TelnetAppender{
	/** 
	 * sends a message to each of the clients in telnet-friendly output. 
	 */
	
	public synchronized void send(final String message){
		System.out.println("SEND: "+message);
		write(String.format("\r\n%s\r\n", message));
	}

	/** 
	 * sends a message to each of the clients in telnet-friendly output. 
	 */
    public synchronized void send(final String message, final String username){
		System.out.println("SEND: "+message);
		write(String.format("username:    %s\r\n", username));
		write(String.format("%s\r\n", message));
}
}