import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
			String[] result = new String[timestamps.length];
		for(int i=0;i<timestamps.length;i++){
			result[i] = String.valueOf(timestamps[i]);
		}
		return result;
	}
	
	/**
	* Main Method: Read input from standard input, solve the problem, and output answer to standard output.
	*/
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] timestamps = new long[n];
		for(int i=0;i<n;i++){
			timestamps[i] = scanner.nextLong();
		}
		String[] timestampsStrs = toTimestampStrs(timestamps);
		Arrays.sort(timestampsStrs);
		for(int i=0;i<n;i++){
			System.out.println(timestampsStrs[i]);
		}
	}
}