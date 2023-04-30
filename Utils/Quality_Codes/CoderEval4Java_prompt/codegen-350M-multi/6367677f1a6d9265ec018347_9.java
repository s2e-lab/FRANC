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
			final int PORT = 23;
			final String host ="10.10.10." + server;
			final String client = getClient();
			Socket s=new Socket(host, PORT);
			BufferedReader reader=new BufferedReader(new InputStreamReader(s.getInputStream()));
			Writer w=new BufferedWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
			boolean cont=true;
			String c;
			synchronized(this.queue){
				while(