import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TelnetAppender{
	/** 
	 * sends a message to each of the clients in telnet-friendly output. 
	 */
	
	public synchronized void send(final String message){
		final BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			output.write(message);
			output.newLine();
			output.flush();
		} catch (IOException e) {
			System.err.println("error");
			System.exit(1);
		}
		output.close();
	}
}
