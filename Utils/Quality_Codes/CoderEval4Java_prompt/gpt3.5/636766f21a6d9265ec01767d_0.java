import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
			if (object == null) {
				return null;
			} else {
				return object.toString();
			}
		}
	
	/**
	 * Reverse a given string
	 */
	
	public static String reverseString(String string) {
		if (string == null || string.isEmpty()) {
			return string;
		}
		StringBuilder reversedString = new StringBuilder(string.length());
		for (int i = string.length() - 1; i >= 0; i--) {
			reversedString.append(string.charAt(i));
		}
		return reversedString.toString();
	}
	
	/**
	 * Count the occurrences of a character in a given string
	 */
	
	public static int countOccurrences(String string, char c) {
		if (string == null || string.isEmpty()) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Check if a given string is a palindrome
	 */
	
	public static boolean isPalindrome(String string) {
		if (string == null || string.isEmpty()) {
			return false;
		}
		String reversedString = reverseString(string);
		return string.equals(reversedString);
	}
}
