import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
		ArrayList<String> out = new ArrayList<String>();
		for(long it:timestamps) out.add(Long.toString(it));
		
		return(out.toArray(new String[0]));
	}
	
	/**
	* Parse a big integer into a long.
	*/
	public static long stringToTimestamp(String input){
		try{
			return  Long.parseLong(input);
		} catch (NumberFormatException e){
			return 0;
		}
	}
	

}