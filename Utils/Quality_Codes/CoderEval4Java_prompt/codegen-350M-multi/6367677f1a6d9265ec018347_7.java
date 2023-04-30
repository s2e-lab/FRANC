import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TelnetAppender{
	/** 
	 * sends a message to each of the clients in telnet-friendly output. 
	 */
	
	public synchronized void send(final String message){
		final Process p = Runtime.getRuntime().exec("/bin/telnet ", null,
				new String[]{"-n", message});
	}
	
	synchronized void close(){
		Runtime.getRuntime().exec("/bin/shutdown", null, null);
	}
	
}

public class telnetAppender
	{
	private List telnets_ = new ArrayList(10);

	/**
	 * adds the given telnet-friendly client at the front or appends it to the list.
	 */

}