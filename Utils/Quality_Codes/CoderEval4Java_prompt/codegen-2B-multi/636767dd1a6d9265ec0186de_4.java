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
		if(timestamp-cache.get(0).getCacheTime()<expiredThreshold) {
			return true;
		}
		return false;
	}
	
	public boolean isExpired(File oldFile){
		if(new File(oldFile.getParent()+"/"+oldFile.getName()).lastModified()-oldFile.lastModified()<expiredThreshold) {
			return true;
		}
		return false;
		
	}
	
}