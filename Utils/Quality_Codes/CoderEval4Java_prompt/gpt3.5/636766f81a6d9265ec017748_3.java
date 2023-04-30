import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CommonCodeUtils{
	/** 
	 * Decoding a string to a string follow the Base64 regular. 
	 */
	
	public static String base64Decode(final String s){
			byte[] decodedBytes = Base64.getDecoder().decode(s);
			return new String(decodedBytes);
	}
	
	/**
	 * Encoding a string to a string follow the Base64 regular.
	 */
	
	public static String base64Encode(final String s){
			byte[] encodedBytes = Base64.getEncoder().encode(s.getBytes());
			return new String(encodedBytes);
	}
	
	/**
	 * Generate a random string with given length and characters.
	 */
	
	public static String generateRandomString(int length, String characters){
			Random random = new Random();
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<length; i++){
					sb.append(characters.charAt(random.nextInt(characters.length())));
			}
			return sb.toString();
	}
	
	/**
	 * Generate a SHA-512 hash string from a given string.
	 */
	
	public static String generateSha512Hash(String s){
			try{
					MessageDigest md = MessageDigest.getInstance("SHA-512");
					byte[] hashInBytes = md.digest(s.getBytes("UTF-8"));

					StringBuilder sb = new StringBuilder();
					for (byte b : hashInBytes) {
							sb.append(String.format("%02x", b));
					}
					return sb.toString();
			} catch(Exception ex){
					ex.printStackTrace();
			}

			return null;
	}

}