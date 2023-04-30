import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
			long year = timeBucket/10000;
		long month = (timeBucket/100)%100;
		long day = timeBucket%100;
		
		long newDay = (day - 1) / dayStep * dayStep + 1;
		
		if (newDay == 1) {
			return year * 10000 + month * 100 + newDay;
		} else if (newDay <= 10) {
			return year * 10000 + month * 100 + newDay;
		} else {
			newDay = newDay - 10;
			if (newDay > 20) {
				newDay = 20;
			}
			long newMonth = (month - 1) / 3 * 3 + 1;
			return year * 10000 + newMonth * 100 + newDay;
		}
	} 
}