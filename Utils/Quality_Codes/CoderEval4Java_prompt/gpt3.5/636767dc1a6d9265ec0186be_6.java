import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
			//Extract the year, month and day components from the time bucket
		int year = (int) (timeBucket / 10000);
		int month = (int) ((timeBucket % 10000) / 100);
		int day = (int) (timeBucket % 100);
		
		//Calculate the new day value based on the dayStep parameter
		int newDay;
		if(day % dayStep == 0){
			newDay = day;
		}else{
			newDay = ((int)(day/dayStep))*dayStep + dayStep/2;
		}
		
		//Create a new time bucket with the updated day value
		long newTimeBucket = year * 10000 + month * 100 + newDay;
		return newTimeBucket;
	}
}