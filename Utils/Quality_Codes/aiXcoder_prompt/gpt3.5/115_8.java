import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
			String[] timestampStrs = new String[timestamps.length]; //create a string array with same length as timestamps array
		for(int i=0;i<timestamps.length;i++){
			timestampStrs[i] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(timestamps[i]*1000L)); //convert each timestamp to a string with the desired format and add it to the string array
		}
		return timestampStrs; //return the string array
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of timestamps: ");
		int n = sc.nextInt();
		long[] timestamps = new long[n];
		System.out.println("Enter timestamps (in seconds): ");
		for(int i=0;i<n;i++){
			timestamps[i] = sc.nextLong();
		}
		String[] timestampStrs = toTimestampStrs(timestamps);
		System.out.println("Timestamp strings:\n");
		for(String str:timestampStrs){
			System.out.println(str);
		}
	}
}