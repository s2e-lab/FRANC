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
		return (timestamp-this.timeLastUpdated) >= expiredThreshold;
	}
	/*
	 * Generate json string for all metrics in this cache
	 */
	public String Metrics(){
		TreeMap<String,Long> metrics = new TreeMap<String,Long>();
		for(String key:listMetrics){
			if(listMetrics.get(key)!=null){
				metrics.put(key, listMetrics.get(key));
			}
		}

}
}