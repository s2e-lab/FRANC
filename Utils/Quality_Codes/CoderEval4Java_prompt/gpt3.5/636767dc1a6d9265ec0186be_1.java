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
		long month = (timeBucket / 100) % 100;
		long day = timeBucket % 100;
		
		long newDay = ((day - 1) / dayStep) * dayStep + 1; // Get the new day value by dividing the original day with dayStep and rounding down to the nearest multiple of dayStep
		if(newDay == day) // If the newDay is same as the original day then return the original timeBucket
			return timeBucket;
		
		if(newDay > 28){ // We need to check for month changes too
			long maxDayInMonth = getMaxDaysInMonth(month, year); // Get the maximum days in current month
			if(newDay > maxDayInMonth) // If newDay is greater than maximum days in current month then change month
				return (year * 10000) + ((month + 1) * 100) + 1; // Return first day of next month as new timeBucket
		}
		
		return (year * 10000) + (month * 100) + newDay; // Return new timeBucket in same year and month
	}
	
	/**
	 * Calculate maximum days in given month and year
	 */
	
	static int getMaxDaysInMonth(int month, long year){
		switch(month){
			case 2:
				if(isLeapYear(year))
					return 29;
				else
					return 28;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			default:
				return 31;
		}
		
	}
	
	/**
	 * Check if given year is a leap year or not
	 */
	
	static boolean isLeapYear(long year){
		if(year % 4 != 0)
			return false;
		else if(year % 400 == 0) 
			return true;
		else if(year % 100 == 0)
			return false;
		else
			return true;
	}
}