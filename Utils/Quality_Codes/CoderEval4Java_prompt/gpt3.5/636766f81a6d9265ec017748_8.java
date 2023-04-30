import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CommonCodeUtils{
	/** 
	 * Decoding a string to a string follow the Base64 regular. 
	 */
	
	public static String base64Decode(final String s){
			// Implementation of base64 decoding
		try{
			byte[] decodedBytes = Base64.getDecoder().decode(s);
			return new String(decodedBytes);
		}
		catch(Exception e){
			System.out.println("Exception occurred while decoding: " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * Encoding a string to a string follow the Base64 regular.
	 */
	
	public static String base64Encode(final String s){
		// Implementation of base64 encoding
		try{
			byte[] encodedBytes = Base64.getEncoder().encode(s.getBytes());
			return new String(encodedBytes);
		}
		catch(Exception e){
			System.out.println("Exception occurred while encoding: " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * Generating a random number in a range of min and max.
	 */
	
	public static int generateRandomNumber(final int min, final int max){
		// Implementation of generating a random number
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
	}
	
	/**
	 * Checking if a number is prime or not.
	 */
	
	public static boolean isPrime(final int n){
		// Implementation of checking if a number is prime or not
		if(n <= 1){
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}