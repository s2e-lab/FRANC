import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
		String[] out = new String[timestamps.length];
		for (int i=0; i<out.length; i++){
			out[i] = timestampToStr(timestamps[i]);
		}
		return out;
	}

	public static String timestampToStr(long timestamp){
		String result = "";
}
}