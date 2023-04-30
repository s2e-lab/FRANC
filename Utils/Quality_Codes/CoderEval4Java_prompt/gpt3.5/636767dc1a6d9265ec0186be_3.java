import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
			long year = timeBucket / 10000L;
		long month = (timeBucket / 100L) % 100L;
		long day = timeBucket % 100L;

		long remainder = day % dayStep;
		long diff = dayStep - remainder;
		if (remainder <= dayStep / 2) {
			day -= remainder;
		} else {
			day += diff;
		}

		if (day <= 0) {
			if (month == 1) {
				year -= 1;
				month = 12;
			} else {
				month -= 1;
			}
			day = computeDays(year, month) - (day * -1);
		} else if (day > computeDays(year, month)) {
			day = day - computeDays(year, month);
			if (month == 12) {
				year += 1;
				month = 1;
			} else {
				month += 1;
			}
		}

		return (year * 10000L + month * 100L + day);
	}

	/** 
	 * Helper function to compute the total number of days in a given year and month
	 */
	private static int computeDays(long year, long month) {
		int cnt = daysInMonth[(int) month - 1];
		if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				cnt += 1;
			}
		}
		return cnt;
	}

	private static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
}