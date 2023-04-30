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
	
	
	/** 
	 * Return the longest common suffix of the
	 * given Strings
	 * 
	 * @param str1 the first String, which is checked for length
	 * @param str2 the second String, which is used in an O(N^3) loop
	 *            over the two Strings
	 * @return the longest common suffix of the two Strings
	 */
	private static String longCommonPrefix(String str1, String str2){

}
}