import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TimeSeriesUtils{
	/** 
	 * Follow the dayStep to re-format the time bucket literal long value. Such as, in dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123
	 */
	
	static long compressTimeBucket(long timeBucket,int dayStep){
			long year = timeBucket/10000;
        long month = (timeBucket/100)%100;
        long day = timeBucket%100;
        
        if(dayStep == 1) return (year*10000 + month*100 + day);
        
        long step = dayStep-1;
        long newDay = day - ((day-1)%step); // this gives us the start day of new bucket
        
        if(newDay == day) return (year*10000 + month*100 + day); // if already aligned to step, no need to modify
        
        Calendar cal = Calendar.getInstance();
        cal.set((int)year, (int)month-1, (int)newDay);
        
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        while(newDay+step <= daysInMonth){
            cal.add(Calendar.DATE, step);
            newDay += step;
        }
        
        return (cal.get(Calendar.YEAR)*10000L + (cal.get(Calendar.MONTH)+1)*100L + cal.get(Calendar.DATE));
    }
}