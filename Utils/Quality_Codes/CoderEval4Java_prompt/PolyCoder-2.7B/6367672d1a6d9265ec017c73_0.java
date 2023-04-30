import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LoggerRateLimiter{
	/** 
	 * Returns true if the message should be printed in the given timestamp, otherwise returns false. If this method returns false, the message will not be printed. The timestamp is in seconds granularity. 
	 */
	
	public boolean shouldPrintMessage(int timestamp,String message){
		 if (timestamp > this.lastTimestamp) this.lastTimestamp = timestamp;
		 
		 if (message.length() == 0) //If there is no text to be logged, the message is ignored, and this is the first pass to print the message.
			 return true;
}
}