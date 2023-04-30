import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		long lStart = start.getTimeInMillis();
		long lEnd = end.getTimeInMillis();
		return ((end.getTimeInMillis()-lStart)/1000);
	}
}
