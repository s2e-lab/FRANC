import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LoggerRateLimiter{
	/** 
	 * Returns true if the message should be printed in the given timestamp, otherwise returns false. If this method returns false, the message will not be printed. The timestamp is in seconds granularity. 
	 */
	
	public boolean shouldPrintMessage(int timestamp,String message){
			boolean print = true;
			if(message!=null)
			{
				String str = message.split("  ,",2)[0];
				int time = Integer.parseInt(str.substring(0,1));
				if(print)
				{
					System.out.println(time);
					print = time>timestamp;				
				}		
			}
			return print;
	}
}