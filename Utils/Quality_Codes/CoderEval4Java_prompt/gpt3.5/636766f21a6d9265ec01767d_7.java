import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
			if(object == null) {
				return null;
			}
			else {
				return object.toString();
			}
		}
	
	/** 
	 * Reverse a string, if null then throw an exception 
	 */
	public static String reverse(String string) throws IllegalArgumentException {
		if(string == null) {
			throw new IllegalArgumentException("Invalid Argument, cannot reverse a null string");
		}
		else {
			String reverseString = "";
			for(int i = string.length()-1; i >= 0; i--) {
				reverseString += string.charAt(i);
			}
			return reverseString;
		}
	}
	
	/** 
	 * Convert an integer to a string, if null then throw an exception 
	 */
	public static String convertToString(Integer integer) throws IllegalArgumentException {
		if(integer == null) {
			throw new IllegalArgumentException("Invalid Argument, cannot convert a null integer to string");
		}
		else {
			return integer.toString();
		}
	}
	
	/** 
	 * Calculate the Levenshtein Distance between two strings 
	 */
	public static int levenshteinDistance(String word1, String word2) {
		int len1 = word1.length();
    	int len2 = word2.length();
 
    	int[][] distance = new int[len1 + 1][len2 + 1];
 
    	for (int i = 0; i <= len1; i++) {
        	distance[i][0] = i;
    	}
    	for (int j = 1; j <= len2; j++) {
        	distance[0][j] = j;
    	}
 
    	for (int i = 1; i <= len1; i++) {
        	for (int j = 1; j <= len2; j++) {
            	int cost = (word1.charAt(i - 1) == word2.charAt(j - 1)) ? 0 : 1;
 
            	distance[i][j] = Math.min(Math.min(distance[i - 1][j] + 1, distance[i][j - 1] + 1), distance[i - 1][j - 1] + cost);
        	}
    	}
 
    	return distance[len1][len2];
	}
}
