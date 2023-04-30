import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
		long nt=(timeBucket / Long.parseLong(dayStep)*Long.parseLong(dayStep))-(timeBucket%Long.parseLong(dayStep));
		return nt;
	}
	
	public static String convertToString(long timeBucket,String dayStep){
		if(dayStep!= null &&!dayStep.isEmpty()){
			return Time.convertToString(timeBucket,dayStep);
		}
		else{
			return Time.convertToString(timeBucket);
		}
	}

}