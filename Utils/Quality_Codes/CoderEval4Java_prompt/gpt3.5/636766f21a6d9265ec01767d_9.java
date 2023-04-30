import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
			if(object == null){
			return null;
		} else {
			return object.toString();
		}
	}
	
	/**
	 * Check if a given string is empty.
	 */
	
	public static boolean isEmpty(String str){
		return (str == null || str.length() == 0);
	}
	
	/**
	 * Check if a given string is not empty.
	 */
	
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}
	
	/**
	 * Check if a given string is blank (empty or contains only whitespace characters).
	 */
	
	public static boolean isBlank(String str){
		return (str == null || str.trim().length() == 0);
	}
	
	/**
	 * Check if a given string is not blank.
	 */
	
	public static boolean isNotBlank(String str){
		return !isBlank(str);
	}
	
	/**
	 * Convert a string to title case (each word capitalized).
	 */
	
	public static String toTitleCase(String str){
		if(isBlank(str)){
			return str;
		}
		StringBuilder sb = new StringBuilder(str.length());
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()){
			String word = st.nextToken();
			sb.append(Character.toUpperCase(word.charAt(0)));
			sb.append(word.substring(1).toLowerCase());
			sb.append(" ");
		}
		return sb.toString().trim();
	}
	
	/**
	 * Remove all whitespace characters (space, tab, line break) from a string.
	 */
	
	public static String removeWhitespace(String str){
		if(isBlank(str)){
			return str;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(!Character.isWhitespace(c)){
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	/**
	 * Generate a random string of given length, consisting of uppercase and lowercase letters and digits.
	 */
	
	public static String generateRandomString(int length){
		if(length <= 0){
			return "";
		}
		StringBuilder sb = new StringBuilder(length);
		Random random = new Random();
}
}