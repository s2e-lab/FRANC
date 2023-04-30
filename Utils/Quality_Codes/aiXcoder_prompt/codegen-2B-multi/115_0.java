import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
		String[] timestampsStrings=new String[timestamps.length];
		for(int i=0;i<timestamps.length;i++){
			timestampsStrings[i]=Long.toString(timestamps[i]);
		}
		return timestampsStrings;
	}
	public static long[] toLongArray(String[] timestamps){
		long[] timestampsLongs=new long[timestamps.length];
}
}