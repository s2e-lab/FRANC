import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
			long year = timeBucket / 10000; // extract year
long month = (timeBucket % 10000) / 100; // extract month
long day = timeBucket % 100; // extract day

if(dayStep == 1){ // daily
    return year * 10000 + month * 100 + day;
}
else if(dayStep == 7){ // weekly, week starts on Monday
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, (int)year);
    calendar.set(Calendar.MONTH, (int)month-1);
    calendar.set(Calendar.DAY_OF_MONTH, (int)day);
    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
    long startOfWeek = timeBucket - ((dayOfWeek - 2) * 24 * 60 * 60 * 1000L); // find the Monday of the week
    return (startOfWeek / 10000) * 10000 + ((startOfWeek % 10000) / 100) * 100 + (startOfWeek % 100) + 7; // add 7 days to get the end of the week
}
else{ // monthly, align to first day of the month
    long monthStart = year * 10000L + month * 100L + 1L;
    int diff = (int)(day - 1) % dayStep;
    if(diff == 0){ // the day is already aligned to the step
        return monthStart;
    }
    else if(diff <= dayStep / 2){ // the day is closer to the beginning of the new bucket
        return monthStart + (day - 1) / dayStep * dayStep;
    }
    else{ // the day is closer to the end of the old bucket
        return monthStart + ((day - 1) / dayStep + 1) * dayStep;
    }
}
}
}