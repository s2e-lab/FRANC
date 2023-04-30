import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
		//This implementation uses a fixed compression time series format from here (http://www.cs.wustl.edu/~schwier/compress.htm).
		long compressedTimeBucket = timeBucket;
		long multiplier = dayStep;
		long decoder = compressedTimeBucket;
		int valueIndex = 0;
		int valueCount = 1;
		while ((decoder%multiplier)!=0){
			decoder /= multiplier;
			valueIndex ++;
			valueCount ++;
		}
}
}