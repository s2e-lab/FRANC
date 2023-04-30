import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
			long day = timeBucket % 100;
        long month = (timeBucket / 100) % 100;
        long year = timeBucket / 10000;
        if (dayStep == 0) {
            return (year * 10000) + (month * 100) + day;
        }
        long time = (Long.parseLong(year + "" + month + "" + day) - 1) / dayStep;
        long reFormatTime = time * dayStep + 1;
        long reFormatDay = reFormatTime % 100;
        long reFormatMonth = (reFormatTime / 100) % 100;
        long reFormatYear = reFormatTime / 10000;
        return (reFormatYear * 10000) + (reFormatMonth * 100) + reFormatDay;
	}
}
