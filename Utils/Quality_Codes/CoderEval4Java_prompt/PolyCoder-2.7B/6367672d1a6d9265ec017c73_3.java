import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LoggerRateLimiter{
	/** 
	 * Returns true if the message should be printed in the given timestamp, otherwise returns false. If this method returns false, the message will not be printed. The timestamp is in seconds granularity. 
	 */
	
	public boolean shouldPrintMessage(int timestamp,String message){
		 if (message.trim().length()==0){
			// The message has a zero length. We still return false.
			return false;
			
		}
		if ((timestamp == 0) || message.equalsIgnoreCase("")){   
			// The message should have a timestamp of 0: do not print it.
			return false;

		}
		System.out.printf("Message: %s %d\n", message, timestamp);
		return true;
	}

}