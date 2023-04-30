import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
		//Time Bucket
		//long start = System.currentTimeMillis();
		long timeBefore = Long.MAX_VALUE / (long) dayStep;
		long[] time = new long[(int) (timeBucket / timeBefore)];
}
}