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
		return timestamp > (metrics.lastUpdateTime + expiredThreshold);
	}
}

/**
 * Your Metrics object will be instantiated and called as such:
 * Metrics obj = new Metrics();
 * obj.update(timestamp,value);
 * boolean param_2 = obj.isExpired(timestamp,expiredThreshold);
 */