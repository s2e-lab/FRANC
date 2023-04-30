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
	 * Generating a random integer between lowerBound and upperBound (inclusive).
	 */
	
	public static int generateRandomInteger(final int lowerBound, final int upperBound){
		return (int)(Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
	}
	
	/**
	 * Shuffling the elements in an array in random order.
	 */
	
	public static void shuffleArray(final int[] arr){
		final int n = arr.length;
		for(int i = 0; i < n; i++){
			final int rand = i + (int)(Math.random() * (n - i));
			final int temp = arr[rand];
			arr[rand] = arr[i];
			arr[i] = temp;
		}
	}
}