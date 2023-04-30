import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
		String[] strs = new String[timestamps.length];
		for(int i=0;i<timestamps.length;i++){
			strs[i] = new Long(timestamps[i]).toString();
		}
		return strs;
	}

}