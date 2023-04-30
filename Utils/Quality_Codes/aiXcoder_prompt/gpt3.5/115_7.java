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
		
		for(int i = 0; i < timestamps.length; i++) {
			Date date = new Date(timestamps[i]); //convert timestamp to Date object
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //format the date
			String formattedDate = sdf.format(date); //convert the date to string
			timestampStrs[i] = formattedDate;
		}
		
		return timestampStrs;
	}
	
	/**
	* Main function to test the toTimestampStrs method.
	*/
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of timestamp values: ");
		int n = sc.nextInt();
		
		long[] timestamps = new long[n];
		
		System.out.println("Enter the timestamp values in milliseconds:");
		for(int i = 0; i < n; i++) {
			timestamps[i] = sc.nextLong();
		}
		
		String[] timestampStrs = toTimestampStrs(timestamps);
		
		System.out.println("The timestamp values in string format are:");
		for(String s : timestampStrs) {
			System.out.println(s);
		}
	}
}