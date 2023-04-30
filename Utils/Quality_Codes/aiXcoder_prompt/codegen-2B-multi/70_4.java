import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		long startTimeInMillis = start.getTime().getTime();
		long endTimeInMillis = end.getTime().getTime();
		return endTimeInMillis - startTimeInMillis;
	}
	
	public static void main(String[] args){
		System.out.println(elapsedTime(Calendar.getInstance(), Calendar.getInstance()));
	}
}

