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
			Date date = new Date(timestamps[i]);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
			format.setTimeZone(TimeZone.getTimeZone("UTC"));
			String formattedDate = format.format(date);
			timestampStrs[i] = formattedDate;
		}
		return timestampStrs;
	}
} 

/**
* Class to test the ID115 program.
*/
public class ID115Test{
	public static void main(String[] args){
		long[] timestamps = {1585242675000L, 1585244872000L, 1585245491000L};
		String[] timestampStrs = ID115.toTimestampStrs(timestamps);
		for(String str : timestampStrs){
			System.out.println(str);
		}
	}
} 
