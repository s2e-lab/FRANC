import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
			String[] timestampStrs = new String[timestamps.length];
		for(int i=0; i<timestamps.length; i++){
			timestampStrs[i] = String.valueOf(timestamps[i]);
		}
		return timestampStrs;
	}
	
	/**
	* Convert a String array of timestamp IDs to a long array.
	*/
	public static long[] toTimestampLongs(String[] timestampStrs){
		long[] timestamps = new long[timestampStrs.length];
		for(int i=0; i<timestampStrs.length; i++){
			timestamps[i] = Long.parseLong(timestampStrs[i]);
		}
		return timestamps;
	}
	
	/**
	* Main
	*/
	public static void main(String[] args){
		
		// Sample Input
		long[] timestamps = {1508206077000L, 1508206078000L, 1508206079000L};
		
		// Convert timestamps to String array
		String[] timestampStrs = toTimestampStrs(timestamps);
		
		// Output the String array
		System.out.println(Arrays.toString(timestampStrs));
		
		// Convert String array back to long array
		long[] newTimestamps = toTimestampLongs(timestampStrs);
		
		// Output the long array
		System.out.println(Arrays.toString(newTimestamps));
	}
}