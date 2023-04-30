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
			String t=str.trim(),x=str.length()-t.length();
			if (x>0 && t.regionMatches(true,0,x))
				t="";
			return t;
	}
	/** 
	 * Trim from the given String.
	 * @param str the String to trim
	 * @return the trimmed String
	 */
	public static String trim(String str){
		return trimTrailingWhitespace(str).trim();
		

		
	}
}