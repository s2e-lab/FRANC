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

for(int i=0;i<timestamps.length;i++){
	// Create a new Date object using the specified timestamp in milliseconds
	Date dateObj = new Date(timestamps[i]);
	// Format the Date object into a string using the specified pattern
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	String formattedDate = formatter.format(dateObj);
	// Add the formatted date string to the array
	timestampStrs[i] = formattedDate;
}

return timestampStrs;

} 
}