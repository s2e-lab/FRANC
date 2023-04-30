import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		int hr=1,mn=1,sec=1;
		if(end.get(Calendar.HOUR_OF_DAY)!=0){
			hr=end.get(Calendar.HOUR_OF_DAY)-1;
		}
		if(end.get(Calendar.MINUTE)!=0){
			mn=end.get(Calendar.MONTH)+1;
		}
}
}