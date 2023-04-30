import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
			c.set(field, 0);
switch(field){
	case Calendar.HOUR_OF_DAY:
	case Calendar.HOUR:
		c.clear(Calendar.MINUTE);
	case Calendar.MINUTE:
		c.clear(Calendar.SECOND);
	case Calendar.SECOND:
		c.clear(Calendar.MILLISECOND);
}
return c;
} 

/**
* Generate a random ID based on a 128-bit UUID algorithm.
*/
public static UUID generateRandomID(){
	Random rnd = new Random();
	long mostSigBits = rnd.nextLong();
	long leastSigBits = rnd.nextLong();
	
	//Set the version to 4
	mostSigBits &= 0xffffffffffff0fffL;
	mostSigBits |= 0x0000000000004000L;
	
	//Set the variant to RFC 4122
	leastSigBits &= 0x3fffffffffffffffL;
	leastSigBits |= 0x8000000000000000L;
	
	return new UUID(mostSigBits, leastSigBits);
}

public static void main(String[] args) {
	Calendar c = Calendar.getInstance();
	c.set(2021, Calendar.MARCH, 1, 12, 30, 0); //Set the date and time to March 1st, 2021 at 12:30 PM
	c = clearTo(c, Calendar.MINUTE); //Clear out the seconds and milliseconds
	long timestamp = c.getTimeInMillis();
	UUID id = generateRandomID();
	
	//Print out the results
	System.out.println("Timestamp: " + timestamp);
	System.out.println("ID: " + id.toString());
}
}