import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		cal.setTime(start);
		cal.setTime(end);
		long start_delta= cal.getTimeInMillis();
		long end_delta = end.getTimeInMillis();
		cal.add(Calendar.MILLISECOND, (int) (end_delta-start_delta)/1000);
		long total_millis = cal.getTimeInMillis();
		return total_millis;
	}
}

