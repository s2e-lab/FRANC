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
		if ( timestamp - this.timestamp > expiredThreshold ) {
			return true;
		}
		return false;
	}

	public void addTimedValue(Object key, Object value, long timestamp) throws IOException{
		
		MetricsTimer timer = this.timerTable.get(key);		
		if(timer == null) {
			try(Timer tm = new Timer(null)) {
			}
			
			timer = this.timerTable.get(key);
		}

}
}