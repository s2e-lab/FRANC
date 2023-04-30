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
			}
			else{
				return object.toString();
			}
		}
		
	/**
	 * Returns true when string is null or empty.
	 */
	
	public static boolean isNullOrEmpty(String str){
		return (str == null || str.isEmpty());
	}
	
	/**
	 * Returns true when string is null, empty or only contains whitespace.
	 */
	
	public static boolean isNullOrWhitespace(String str){
		if(str == null || str.isEmpty()){
			return true;
		}
		for(int i=0;i<str.length();i++){
			if(!Character.isWhitespace(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns a string with first letter capitalized.
	 */
	
	public static String capitalize(String str){
		if(isNullOrEmpty(str)){
			return str;
		}
		else if(str.length() == 1){
			return str.toUpperCase();
		}
		else{
			return str.substring(0,1).toUpperCase() + str.substring(1);
		}
	}
	
	/**
	 * Returns a string with first letter of each word in the string capitalized.
	 */
	
	public static String capitalizeWords(String str){
		if(isNullOrEmpty(str)){
			return str;
		}
		String[] words = str.split("\\s");
		StringBuilder result = new StringBuilder();
		for(String word: words){
			result.append(capitalize(word) + " ");
		}
		return result.toString().trim();
	}
	
	/**
	 * Reverses a string.
	 */
	
	public static String reverse(String str){
		StringBuilder result = new StringBuilder(str);
		result.reverse();
		return result.toString();
	}
	
	/**
	 * Removes all whitespace characters from a string.
	 */
	
	public static String removeWhitespace(String str){
		return str.replaceAll("\\s+","");
	}
	
	/**
	 * Returns the number of occurrences of a substring inside a string.
	 */
	
	public static int countOccurrences(String str, String substr){
		return str.split(substr,-1).length-1;
	}
} 
