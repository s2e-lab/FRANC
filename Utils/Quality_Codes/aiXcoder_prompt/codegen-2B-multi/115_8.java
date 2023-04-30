import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
		int tsSize = timestamps.length;
		String[] str = new String[tsSize];
		
		for(int i = 0; i < tsSize; i++){
			str[i] = String.valueOf(timestamps[i]);
		}
		
		return str;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long[] timestamps = new long[3];
		
}
}