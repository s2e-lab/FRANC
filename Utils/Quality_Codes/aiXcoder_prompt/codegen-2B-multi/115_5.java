import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
		String[] out=new String[timestamps.length];
		for(int i=0;i<out.length;i++){
			out[i]=Long.toString(timestamps[i]);
		}
		return out;
	}

	public static long[] parseTimestamps(String[] timestamps){
		long[] out=new long[timestamps.length];
}
}