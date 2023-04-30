import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
		long longBits=0;
		
		if (timeBucket % dayStep == 0){
			//compress long  timeBucket, compress the first time bucket
			longBits = compressLong(longBits,timeBucket);
			return longBits;
		}
}
}