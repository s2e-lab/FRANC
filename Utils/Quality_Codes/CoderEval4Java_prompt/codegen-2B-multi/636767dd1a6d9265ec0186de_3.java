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
		if(System.currentTimeMillis()>= timestamp){
			return false;
		} else {
			return System.currentTimeMillis()-timestamp>=expiredThreshold? true:false;
		}
	}
	/** 
	 * Reads cache from text file.
	 * @param text file with cache
	 * @return ArrayList<HashMap>
	 */
	public ArrayList<HashMap> readCache(String filename){
}
}