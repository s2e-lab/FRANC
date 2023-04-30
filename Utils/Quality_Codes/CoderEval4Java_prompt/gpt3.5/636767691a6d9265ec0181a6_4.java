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
			if(toSplit == null || delimiter == null) {
				return null;
			}
			int index = toSplit.indexOf(delimiter);
			if(index == -1) {
				return null;
			}
			String[] result = new String[2];
			result[0] = toSplit.substring(0, index);
			result[1] = toSplit.substring(index + delimiter.length());
			return result;
	}
	
	/** 
	 * Reverse a given String.
	 * @param str the String to reverse
	 * @return a new String with the characters in reverse order
	 */
	public static String reverse(String str){
		if(str == null) {
			return null;
		}
		return new StringBuilder(str).reverse().toString();
	}
	
	/** 
	 * Check if a given String is a palindrome (i.e. reads the same forwards and backwards).
	 * @param str the String to check
	 * @return <code>true</code> if the String is a palindrome, <code>false</code> otherwise
	 */
	public static boolean isPalindrome(String str){
		if(str == null) {
			return false;
		}
		return str.equals(reverse(str));
	}
}