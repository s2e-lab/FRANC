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
		if(timestamp < m_lastUpdateTime + expiredThreshold){
			return true;
		}
		else{
			return false;
		}
	}

	/** A time stamp is used to check whether an item has expired and if yes, then this is removed from cache. 
     * @param cache The cache 
     */
    public void updateLastUpdateTime(long timestamp){
        m_lastUpdateTime = Math.max(m_lastUpdateTime, timestamp);
    }
      
	/** 
	 * @param cache
	 */

}