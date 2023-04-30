import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CommonCodeUtils{
	/** 
	 * Decoding a string to a string follow the Base64 regular. 
	 */
	
	public static String base64Decode(final String s){
			// Begin by decoding the input string locally
		String decodedString = "";
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(s);
			decodedString = new String(decodedBytes, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error in base64Decode: " + e.getMessage());
		}
		// Return the decoded string
		return decodedString;
	}
}