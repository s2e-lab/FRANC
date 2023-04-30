import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CommonCodeUtils{
	/** 
	 * Decoding a string to a string follow the Base64 regular. 
	 */
	
	public static String base64Decode(final String s){
			// Implementation of Base64 decoding algorithm

		// Creating a byte array to store the input string
		byte[] inputBytes = s.getBytes();

		// Creating a new Base64 Decoder
		Base64.Decoder decoder = Base64.getDecoder();

		// Decoding the input bytes using the decoder and storing the result in a byte array
		byte[] decodedBytes = decoder.decode(inputBytes);

		// Converting the decoded byte array to string and returning
		return new String(decodedBytes);
	}
}