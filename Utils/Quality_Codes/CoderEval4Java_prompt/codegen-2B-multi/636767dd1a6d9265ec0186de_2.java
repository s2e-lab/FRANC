import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Metrics{
	/** 
	 * @param timestamp        of current time
	 * @param expiredThreshold represents the duration between last update time and the time point removing from cache.
	 * @return true means this metrics should be removed from cache.
	 */
	
	public boolean isExpired(long timestamp,long expiredThreshold){
		if (metrics.isEmpty())
			return true;
		else if (timestamp-lastUpdate > expiredThreshold)
			return true;
		else
			return false;
		
	}
	
	public String getLastCheckpoint(){
		return lastCheckpoint;
	}
	
	public void setLastCheckpoint(String ck){
		this.lastCheckpoint = ck;
}
}