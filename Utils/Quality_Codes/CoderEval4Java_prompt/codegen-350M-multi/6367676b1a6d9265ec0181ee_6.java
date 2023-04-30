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
		int length = str.length();
		if(length <= 0)
			return "";
	
			String[] arr = { str.substring(length) };	
	
		return arr[0];
	}
	
	
	/** 
	 * Trim whitespace from the given String[].
	 * @param strs the array of Strings to check
	 * @return the list of trimmed Strings
	 * @see java.lang.String#trim()
	 */
	 
}