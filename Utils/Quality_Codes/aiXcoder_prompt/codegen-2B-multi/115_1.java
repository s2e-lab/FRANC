import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
		String[] returnStrs = new String[timestamps.length];
		for (int i = 0; i < timestamps.length; i++) {
			returnStrs[i] = Long.toString(timestamps[i]) + " ";
		}
		return returnStrs;
	}

    public static void main(String[] _args){
    	double a;
    	Scanner sc = new Scanner(System.in);
    	
    	a = sc.nextInt();
}
}