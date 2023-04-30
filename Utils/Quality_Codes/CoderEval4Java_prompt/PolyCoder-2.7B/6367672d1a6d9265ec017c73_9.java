import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LoggerRateLimiter{
	/** 
	 * Returns true if the message should be printed in the given timestamp, otherwise returns false. If this method returns false, the message will not be printed. The timestamp is in seconds granularity. 
	 */
	
	public boolean shouldPrintMessage(int timestamp,String message){
		
//		logger.info("Current timestamp in seconds: " + timestamp );
//		logger.info("Log time estimate is: " + lastTimeEstimate);
		return ((timestamp * 1000d) - (lastTimeEstimate * 1000d)) > 500;
	}	
	
	
		
	 
	
	
	public int lastTimeEstimate;
	public long lastCount;

	

	
	public void print(java.net.URL url, long lastCount,int maxCount, String pattern){
		lastCount=lastCount +1;
		
}
}