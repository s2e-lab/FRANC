import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
		long compressedTimeBucket= (long)timeBucket << (dayStep-1);
		long result;
        while(compressedTimeBucket==0){
            result=dayStep;
            compressedTimeBucket=timeBucket;
            for (int i=0;i<dayStep-3;i++)
                compressedTimeBucket =compressedTimeBucket + compressedTimeBucket<<((dayStep-1 - i)%18);
        }
		
		return compressedTimeBucket;
	}
	
	

}