import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
			c.clear(field);
for(int i=field+1; i<=Calendar.MILLISECOND; i++){
   c.set(i, 0);
}
return c;
} 

/**
* Generate an ID-128 string based on the given timestamp and sequence number. The output string will have the format:
* 
*   {time_low}-{time_mid}-{time_high_and_version}-{clk_seq_and_node}
* 
* where:
* 
*   - time_low is the low 32 bits of the timestamp
*   - time_mid is the middle 16 bits of the timestamp
*   - time_high_and_version is the high 16 bits of the timestamp, followed by the version number (most significant 4 bits are the version, remaining 12 bits are the high timestamp bits)
*   - clk_seq_and_node is the clock sequence (14 bits) followed by the node identifier (48 bits)
*
* @param timestamp the timestamp to use for the ID generation
* @param sequence the sequence number to use for the ID generation
* @return the generated ID-128 string
*/
public static String generateId128(long timestamp, int sequence){
//Create a new UUID with the given timestamp and sequence number
UUID uuid = new UUID(createTimeUuidMostSigBits(timestamp), (long)sequence << 48);

//Convert the UUID to a string with the desired format
return uuid.toString().replace("-", "");
}

/**
* Helper method to create the most significant 64 bits of a UUID based on a timestamp.
*/
private static long createTimeUuidMostSigBits(long timestamp){
//Get the timestamp in milliseconds since the Unix epoch
long timeMillis = timestamp / 10000;

//Get the number of 100-nanosecond intervals since the Gregorian calendar's inception that corresponds to the given timestamp
long timeNanos = (timestamp % 10000) * 100;

//Apply the necessary bit shifts and masks to create the 64 most significant bits of the UUID
}
}