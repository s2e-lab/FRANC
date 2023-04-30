import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
			long year = timeBucket / 10000;
		long month = (timeBucket % 10000) / 100;
		long day = timeBucket % 100;
		long newDay = ((day - 1) / dayStep) * dayStep + 1; // find the earliest day of the current time bucket, based on the given dayStep
		if (newDay == 1) {
			// if the earliest day is the first day of the month, set the new year and month accordingly
			if (month == 1) {
				year--;
				month = 12;
			} else {
				month--;
			}
			// find the day of the last month
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				day = 30;
			} else if (month == 2) {
				if (isLeap(year)) {
					day = 29;
				} else {
					day = 28;
				}
			} else {
				day = 31;
			}
		} else {
			day = newDay; // set the new day
		}
		long newTimeBucket = year * 10000 + month * 100 + day; // re-format the time bucket
		return newTimeBucket;
	}

	/** 
	 * Check if a year is a leap year or not.
	 */
	private static boolean isLeap(long year){
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			return true;
		}else{
			return false;
		}
	}
}