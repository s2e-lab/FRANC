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
			int start = str.length();
			while(start > 0 && (str.charAt(start-1) =='' || str.charAt(start-1) == '\t')){start--;}
			return str.substring(0,start);
	}
	
	
}