import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LoggerRateLimiter{
	/** 
	 * Returns true if the message should be printed in the given timestamp, otherwise returns false. If this method returns false, the message will not be printed. The timestamp is in seconds granularity. 
	 */
	
	public boolean shouldPrintMessage(int timestamp,String message){
			return timestamp - message.length() > 0;
	}
	
	public void println(long messageTimestamp,boolean isLastMinute,String message){
			if(isLastMinute &&!MessageUtils.shouldPrintMessage(messageTimestamp)){
				
				System.out.print(message.replaceAll("\\W", ("" + ((int) (new Date().getTime()) - (new Date(messageTimestamp)) % (60*1000L)))) + "\n");
			}else{
				System.out.print(message.replaceAll("\\W", ""));
			}
	
}
}