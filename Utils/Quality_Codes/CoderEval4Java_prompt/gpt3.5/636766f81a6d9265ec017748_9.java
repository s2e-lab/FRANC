import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CommonCodeUtils{
	/** 
	 * Decoding a string to a string follow the Base64 regular. 
	 */
	
	public static String base64Decode(final String s){
			return new String(Base64.getDecoder().decode(s));
	}
	
	/**
	 * Encoding a string to a string follow the Base64 regular.
	 */
	
	public static String base64Encode(final String s){
		return Base64.getEncoder().encodeToString(s.getBytes());
	}
	
	/**
	 * Generating a random integer between the given range.
	 */
	
	public static int generateRandomInt(int min, int max){
		Random random = new Random();
		return random.nextInt(max-min+1)+min;
	}
	
	/**
	 * Converting a string to its MD5 hash value.
	 */
	
	public static String md5(String input){
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
			String hashtext = number.toString(16);
			while(hashtext.length() < 32){
				hashtext = "0" + hashtext;
			}
			return hashtext;
		}catch(NoSuchAlgorithmException e){
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Getting current date & time in the specified format.
	 */
	
	public static String getCurrentDateTime(String format){
		SimpleDateFormat sdfDate = new SimpleDateFormat(format);
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    return strDate;
	}
}