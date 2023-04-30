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
		String s = "";
		for (int i = 0; i < str.length(); i ++)
			if (!Character.isWhitespace(str.charAt(i)))
				s += str.charAt(i);
		return s;
	}
	/** 
	 * Get all characters (as String Objects) in the given string array.
	 * @param a an array of String Objects
	 * @return a list of String objects, in the same order as the given array
	 */
	
}