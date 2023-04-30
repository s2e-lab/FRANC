import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TelnetAppender{
	/** 
	 * sends a message to each of the clients in telnet-friendly output. 
	 */
	
	public synchronized void send(final String message){
		final String cmd = "!echo &;"+message;
		final String reply = "> "+socket.getName()+"\r\n";
		final OutputStream writer = new BufferedOutputStream(socket.getOutputStream());
		writer.write(cmd.getBytes());
		writer.write(reply.getBytes());

		
		
}
}