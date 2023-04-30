import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Trim trailing whitespace from the given String.
	 * @param str the String to check
	 * @return the trimmed String
	 * @see java.lang.Character#isWhitespace
	 */
	
	public static String trimTrailingWhitespace(String str){
		StringBuilder sb = new StringBuilder(str);
		
		while(sb.charAt(sb.length() - 1) ==''){
			sb.setLength(sb.length() - 1);
		}

		return(sb.toString());
	}
	
	public static double calculateProbability (int[] input, int n, int m) {
		int total=0;
		for (int i = 0; i < n; i++) {
			total += input[i];
		}

		int p = total - m;
}
}