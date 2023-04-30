import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Split a String at the first occurrence of the delimiter. Does not include the delimiter in the result.
	 * @param toSplit the string to split
	 * @param delimiter to split the string up with
	 * @return a two element array with index 0 being before the delimiter, andindex 1 being after the delimiter (neither element includes the delimiter); or <code>null</code> if the delimiter wasn't found in the given input String
	 */
	
	public static String[] split(String toSplit,String delimiter){
			if(toSplit == null || delimiter == null) return null;
		int delimiterIndex = toSplit.indexOf(delimiter);
		if(delimiterIndex == -1) return null;
		String[] result = new String[2];
		result[0] = toSplit.substring(0, delimiterIndex);
		result[1] = toSplit.substring(delimiterIndex + delimiter.length());
		return result;
	}
	
	/**
	 * Reverses the characters in a given string.
	 * @param str the string to reverse
	 * @return a new string with the characters in reverse order
	 */
	
	public static String reverse(String str){
		if(str == null) return null;
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	/**
	 * Checks if a given string is palindrome or not.
	 * @param str the string to check
	 * @return <code>true</code> if the string is palindrome, <code>false</code> otherwise
	 */
	
	public static boolean isPalindrome(String str){
		if(str == null) return false;
		String reversedStr = reverse(str);
		return str.equals(reversedStr);
	}
	
	/**
	 * Converts a given string to a number (integer or decimal).
	 * @param str the string to convert
	 * @return the converted number in <code>int</code> or <code>double</code> format; or <code>null</code> if the string is not a valid number
	 */
	
	public static Number toNumber(String str){
		if(str == null) return null;
		str = str.trim();
		if(str.isEmpty()) return null;
		try{
			return Integer.parseInt(str);
		}catch(NumberFormatException e){
			try{
				return Double.parseDouble(str);
			}catch(NumberFormatException ex){
				return null;
			}
		}
	}
	
	/**
	 * Generates a random string of a given length.
	 * @param length the length of the random string to generate
	 * @return the randomly generated string
	 */
	
	public static String generateRandomString(int length){
		if(length < 1) return null;
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for(int i=0; i<length; i++){
			char c = (char)(random.nextInt(26) + 'a');
			sb.append(c);
		}
		return sb.toString();
	}
}