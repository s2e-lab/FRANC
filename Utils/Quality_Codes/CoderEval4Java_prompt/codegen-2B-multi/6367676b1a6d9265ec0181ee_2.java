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
		return str.trim().replaceAll("\\s+$", "");
	}
	
	/**
	 * Trims whitespace from the start of the given String.
	 * @param str the String to check
	 * @return the trimmed String
	 */
	public static String trimLeadingWhitespace(String str){
		return str.replaceAll("\\s+", "");
	}
	
}