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
		return timestamp>expiredThreshold;
	}

	/**
	 * 
	 * @param timestamp
	 * @return True if this metrics will trigger event or false if it is not relevant.
	 */
	public boolean isTrigger(long timestamp){
		return timestamp>this.lastUpdateTime;
	}
}
