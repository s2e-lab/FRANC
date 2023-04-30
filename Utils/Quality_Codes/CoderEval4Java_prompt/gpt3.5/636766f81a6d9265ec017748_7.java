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
		byte[] decodedBytes = Base64.getDecoder().decode(s);
		String decodedString = new String(decodedBytes);
		return decodedString;
	}
	
	/** 
	 * Encoding a string to a string follow the Base64 regular.
	 */
	public static String base64Encode(final String s){
		// Implementation of Base64 encoding algorithm
		byte[] encodedBytes = Base64.getEncoder().encode(s.getBytes());
		String encodedString = new String(encodedBytes);
		return encodedString;
	}
	
	/**
	 * Reading input from console using BufferedReader.
	 */
	public static String readInputFromConsole(){
		String inputLine = null;
		try{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();			
		}catch(IOException ex){
			System.out.println("Error reading input!");
			ex.printStackTrace();
		}
		return inputLine;
	}
	
	/**
	 * Generating a random integer in a given range.
	 */
	public static int generateRandomNumberInRange(int min, int max){
		Random rand = new Random();
		int randomNumber = rand.nextInt((max - min) + 1) + min;
		return randomNumber;
	}
	
	/**
	 * Generating a random boolean value.
	 */
	public static boolean generateRandomBoolean(){
		Random rand = new Random();
		return rand.nextBoolean();
	}
	
	/**
	 * Generating a random string of a given length.
	 */
	public static String generateRandomString(int length){
		final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<length; i++){
			int randomIndex = rand.nextInt(characters.length());
			sb.append(characters.charAt(randomIndex));
		}
		return sb.toString();
	}
	
	/**
	 * Rounding off a double to a given number of decimal places.
	 */
	public static double roundOffDouble(double num, int decimalPlaces){
		BigDecimal bd = new BigDecimal(num);
		bd = bd.setScale(decimalPlaces, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}