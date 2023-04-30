import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TelnetAppender{
	/** 
	 * sends a message to each of the clients in telnet-friendly output. 
	 */
	
	public synchronized void send(final String message){
		try{
			BufferedWriter writer =  new BufferedWriter(new FileWriter("telnet-output.txt"));  
				for(int i=0; i>0; i = i-1){
					writer.write(String.valueOf(message));
					writer.newLine();
					writer.flush();
				}
				writer.close();
			}catch(Exception e){		 
				
			}
}
}