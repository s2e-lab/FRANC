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
		String trimmed = str;
		while (trimmed.length() > 0 &&Character.isWhitespace(trimmed.charAt(0)))
			trimmed = trimmed.substring(1);
		return trimmed;
	}
	
	/**
	 * Converts a given string to upper-case letters, e.g. "abc" becomes "ABC",
	 * and "AbC" becomes "ABC".
	 * @param str the string to convert
	 * @return the updated string
	 */
	
}