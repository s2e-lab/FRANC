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
	switch (field) {
		case Calendar.HOUR:
		case Calendar.HOUR_OF_DAY:
			c.clear(Calendar.MINUTE);
		case Calendar.MINUTE:
			c.clear(Calendar.SECOND);
		case Calendar.SECOND:
			c.clear(Calendar.MILLISECOND);
		default:
			break;
	}
	return c;
}

/**
* Generate a random UUID (version 4) represented as a string of 32 hexadecimal digits, all lowercase.
*/
public static String generateUUID(){
	UUID uuid = UUID.randomUUID();
	String hex = uuid.toString().replace("-", "");
	return hex.toLowerCase();
}

/**
* Convert a UUID string (formatted as 32 hexadecimal digits with or without hyphens) to an array of 16 bytes.
*/
public static byte[] uuidToByteArray(String uuid){
	uuid = uuid.replaceAll("-", "");
	byte[] bytes = new byte[16];
	for (int i = 0; i < 16; i++) {
		bytes[i] = (byte) Integer.parseInt(uuid.substring(i*2, i*2+2), 16);
	}
	return bytes;
}

/**
* Convert an array of 16 bytes to a UUID string (formatted as 32 hexadecimal digits with hyphens).
*/
public static String byteArrayToUUID(byte[] bytes){
	UUID uuid = new UUID(new BigInteger(bytes), 0);
	String uuidString = uuid.toString();
	return uuidString;
}

/**
* Generate an ID128 string, using the current date and time (to the nearest minute) and a random UUID (version 4).
*/
public static String generateID128(){
	Calendar now = Calendar.getInstance();
	now = clearTo(now, Calendar.MINUTE);
	String dateString = String.format("%1$tY%1$tm%1$td%1$tH%1$tM", now);
	String uuidString = generateUUID();
	return dateString + uuidString;
}
}