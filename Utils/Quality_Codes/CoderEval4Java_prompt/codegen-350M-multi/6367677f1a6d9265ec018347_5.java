import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TelnetAppender{
	/** 
	 * sends a message to each of the clients in telnet-friendly output. 
	 */
	
	public synchronized void send(final String message){
		sendMessage(message, MessageType.TELNET);
	}
	/** 
	 * sends a message to the each client in a packet. 
	 * @param message - message to be sent. 
	 * @param Type - type of message 
	 */
	public synchronized void send(final String message, final MessageType type){
}
}