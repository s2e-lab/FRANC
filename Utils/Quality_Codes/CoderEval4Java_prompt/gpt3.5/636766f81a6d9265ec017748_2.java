import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CommonCodeUtils{
	/** 
	 * Decoding a string to a string follow the Base64 regular. 
	 */
	
	public static String base64Decode(final String s){
			// First, we need to decode the input string into a byte array.
	byte[] decoded = Base64.getDecoder().decode(s);
	// Then, we need to convert the byte array into a string.
	String result = new String(decoded);
	return result;
}

/**
 * Encoding a string to a string follow the Base64 regular.
 */

public static String base64Encode(final String s){
	// First, we need to convert the string into a byte array.
	byte[] bytes = s.getBytes();
	// Then, we need to encode the byte array into a Base64 string.
	String result = Base64.getEncoder().encodeToString(bytes);
	return result;
	}
}