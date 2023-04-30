import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CommonCodeUtils{
	/** 
	 * Decoding a string to a string follow the Base64 regular. 
	 */
	
	public static String base64Decode(final String s){
			String decodedString = "";
		try {
			byte[] byteString = Base64.getDecoder().decode(s);
			decodedString = new String(byteString, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return decodedString;
	}
	
	/** 
	 * Encoding a string to a string follow the Base64 regular. 
	 */
	
	public static String base64Encode(final String s){
		String encodedString = "";
		try {
			byte[] byteString = s.getBytes("UTF-8");
			encodedString = Base64.getEncoder().encodeToString(byteString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return encodedString;
    }
    
    /**
     * Generating a random number within a specified range
     */
    
    public static int generateRandomNumber(int minRange, int maxRange){
        Random rand = new Random(); 
        int randomNumber = rand.nextInt(maxRange-minRange) + minRange;
        return randomNumber;
    }
}