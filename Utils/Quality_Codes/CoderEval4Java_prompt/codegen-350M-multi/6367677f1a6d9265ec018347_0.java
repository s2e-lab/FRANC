import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TelnetAppender{
	/** 
	 * sends a message to each of the clients in telnet-friendly output. 
	 */
	
	public synchronized void send(final String message){
		String command=new String(new char[] { 'C' });
		OutputStreamWriter wr=null;

		synchronized(this.message){
			if(this.isConnected()){
				wr=new OutputStreamWriter(this.socket.newOutputStream());
				wr.write(this.message);
		    	this.message=null;
			}
	 	}

	  	wr.write(command);//this.command);
}
}