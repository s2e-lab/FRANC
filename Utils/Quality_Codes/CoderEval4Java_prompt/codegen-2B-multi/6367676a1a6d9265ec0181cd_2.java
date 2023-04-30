import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Trim leading whitespace from the given String.
	 * @param str the String to check
	 * @return the trimmed String
	 * @see java.lang.Character#isWhitespace
	 */
	
	public static String trimLeadingWhitespace(String str){
		return str.replaceFirst("^\\s+", "");
	}
	
	
	// https://www.hackerrank.com/challenges/java-string/problem
	
		public final static Map<Integer, String> map = new HashMap<Integer, String>();
		public static void main(String... args){
			Scanner in = new Scanner(System.in);
			String strIn = in.next();
			StringBuilder sb = new StringBuilder();
			map.put(1, "");
}
}