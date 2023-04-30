import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
		//Converts time bucket from 10000000 milliseconds to 1,000,000 milliseconds
		if(timeBucket < 10000000){
			timeBucket += dayStep*90000;
		}else if(timeBucket < 1000000){
			timeBucket += (1+dayStep)*90000;
		}else if(timeBucket < 1000000){
			timeBucket += (1+2*dayStep)*90000;
		}else{
			return timeBucket;
		}
		return timeBucket-dayStep*1000;
	}

}