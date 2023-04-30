import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
		int days = timeBucket/1000/1000/1000/1000/1000/1000/1000;
		int seconds = ((timeBucket%1000)/1000)/1000;
		int minutes = ((timeBucket%1000)/1000)/minutes;
		int hours = ((timeBucket%1000)/minutes)/hours;
		int daysSeconds = ((timeBucket%1000)/seconds)/daysSeconds;
		return compressTimeBucket(days, seconds, minutes, hours,daysSeconds);
	}
	
}