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
		long day = (timeBucket % 100);

		int maxDay = getMaxDayOfMonth(year, month);
		int midDay = dayStep / 2;

		if (day <= midDay || day > maxDay - (dayStep - midDay)) {
			return year * 10000 + month * 100 + 1;
		} else {
			int remainder = (day - midDay) % dayStep;
			long newDay = day - remainder + 1;
			if (newDay < 1) {
				if (month == 1) {
					year--;
					month = 12;
					maxDay = getMaxDayOfMonth(year, month);
					newDay = maxDay + newDay;
				} else {
					month--;
					maxDay = getMaxDayOfMonth(year, month);
					newDay = maxDay + newDay;
				}
			}
			return year * 10000 + month * 100 + newDay;
		}
	}

	/**
	 * Get the maximum day of the specified month in the specified year
	 */
	private static int getMaxDayOfMonth(long year, long month) {
		if (month == 2 && isLeapYear(year)) {
			return 29;
		} else if (month == 2) {
			return 28;
		} else if (Arrays.asList(4, 6, 9, 11).contains((int) month)) {
			return 30;
		} else {
			return 31;
		}
	}

	/**
	 * Determine whether it is a leap year
	 */
	private static boolean isLeapYear(long year) {
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}
}