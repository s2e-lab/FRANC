import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		long milliseconds = end.getTimeInMillis()-start.getTimeInMillis();
		return milliseconds;
	}
	/**
	* Calculate the number of milliseconds for a run of the algorithm.
	*/
	public static int numberOfMilliseconds(long start,long end){
		return (int) (end-start);
	}
	/**
	* Algorithm main loop.
	*/
	public static Iterator<List<String>> algorithm(boolean verbose){
}
}