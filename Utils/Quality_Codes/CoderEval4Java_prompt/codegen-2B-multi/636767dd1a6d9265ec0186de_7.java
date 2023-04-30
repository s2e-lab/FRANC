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
		if (timestamp < timestamp || timestamp < 0)
			return false;
		if (expiredThreshold > 0)
			return (timestamp - expiredThreshold) > 0;
		return false;
	} 
};

/**
 * Your Metrics object will be instantiated and called as such:
 * Metrics obj = new Metrics();
 * obj.update(timestamp);
 * boolean param_2 = obj.isExpired(timestamp,expiredThreshold);
 */
