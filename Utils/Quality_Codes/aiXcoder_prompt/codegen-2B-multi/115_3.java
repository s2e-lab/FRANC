import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
		String[] res = new String[timestamps.length];
		for(int i=0; i<timestamps.length; i++)
			res[i] = String.valueOf(timestamps[i]);
		return res;
	}
	
    public static void main(String[] args) throws IOException{
}
}