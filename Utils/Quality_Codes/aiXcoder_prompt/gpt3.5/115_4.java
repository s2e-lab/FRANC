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
			timestampStrs[i] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(timestamps[i]*1000));
		}
		return timestampStrs;
	}
	
	public static void main(String[] args){
		long[] timestamps = {1605540925, 1605540926, 1605540927, 1605540928};
		String[] timestampStrs = toTimestampStrs(timestamps);
		for(String timestampStr : timestampStrs){
			System.out.println(timestampStr);
		}
	}
}