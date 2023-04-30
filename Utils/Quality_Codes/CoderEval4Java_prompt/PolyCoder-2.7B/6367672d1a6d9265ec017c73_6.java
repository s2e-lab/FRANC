import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LoggerRateLimiter{
	/** 
	 * Returns true if the message should be printed in the given timestamp, otherwise returns false. If this method returns false, the message will not be printed. The timestamp is in seconds granularity. 
	 */
	
	public boolean shouldPrintMessage(int timestamp,String message){
		 //If true, output is on screen
		if(true){
	    	System.out.println("Logger logger: " + timestamp + " " + message);
		}
		return true;
	 }
}