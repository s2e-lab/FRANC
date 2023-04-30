import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
		timeBucket  = String.format("%02d%02d/%04d%02d:%02d:%02d",0+dayStep,0+dayStep, 1970+timeBucket, 0+timeBucket, 23+dayStep, 0+timeBucket);
		return timeBucket;
	}
	
	static double compressTimeBucket(double timeBucket,int dayStep){
}
}