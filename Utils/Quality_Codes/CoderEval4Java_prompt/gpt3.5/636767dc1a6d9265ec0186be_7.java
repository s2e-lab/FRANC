import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
			long year = timeBucket / 10000; // extract year from timeBucket
long month = (timeBucket / 100) % 100; // extract month from timeBucket
long day = timeBucket % 100; // extract day from timeBucket

// compute number of days elapsed since the start of the year
long daysSinceStartOfYear = day - 1 + (month - 1) * 31;

// adjust daysSinceStartOfYear to reflect the given dayStep
long adjustedDaysSinceStartOfYear = daysSinceStartOfYear - (daysSinceStartOfYear % dayStep);

// compute the new day, month, and year values based on the adjusted daysSinceStartOfYear
long newDay = (adjustedDaysSinceStartOfYear % 31) + 1;
long newMonth = ((adjustedDaysSinceStartOfYear / 31) % 12) + 1;
long newYear = year;

if (newMonth == 1 && month == 12) {
    newYear--; // special case where the original month is December and the new month is January
}

// combine the new day, month, and year values into a long value representing the new time bucket
long newTimeBucket = (newYear * 10000) + (newMonth * 100) + newDay;

return newTimeBucket;
} 
}