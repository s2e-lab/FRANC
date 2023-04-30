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
			String[] result = new String[2];
		int index = toSplit.indexOf(delimiter);
		if (index == -1) {
			return null;
		}
		result[0] = toSplit.substring(0, index);
		result[1] = toSplit.substring(index + delimiter.length());
		return result;
	}
	
	/**
	 * Reverses a String.
	 * @param text the String to reverse
	 * @return the reversed String
	 */
	
	public static String reverseString(String text){
		return new StringBuilder(text).reverse().toString();
	}
	
	/**
	 * Generates a random String of the given length.
	 * @param length the length of the String to generate
	 * @return the randomly generated String
	 */
	
	public static String generateRandomString(int length){
		String validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++){
			sb.append(validChars.charAt(random.nextInt(validChars.length())));
		}
		return sb.toString();
	}
	
	/**
	 * Computes the Levenshtein distance between two Strings - the minimum number of edits (insertions, deletions, or substitutions of single characters) needed to transform one string into the other.
	 * @param s1 the first String
	 * @param s2 the second String
	 * @return the Levenshtein distance
	 */
	
	public static int levenshteinDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
 
        int[][] dp = new int[m + 1][n + 1];
 
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
 
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
 
}
}