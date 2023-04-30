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
		// check if the first char is not a whitespace character and
		// the next char is a whitespace character
		if((str.charAt(0)!='') && Character.isWhitespace(str.charAt(1)) ){
		    str = str.substring(1, str.length());
		}
		
		// trim the trailing characters, too
}
}