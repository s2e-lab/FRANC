import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
		String[] ret = new String[timestamps.length];
		for(int i=0; i<timestamps.length; i++){
			ret[i] = Long.toString(timestamps[i]);
		}
		return ret;
	}

	// Time Format is yyyy-MM-dd HH:mm:ss
	public static long[] setTimestampsFromStrs(String[] timestamps){
		long[] result = new long[timestamps.length];
		Date d = new Date();
}
}