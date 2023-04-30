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
		if (str == null)
			return null;
		int start = 0;
		while (start < str.length()){
			char c = str.charAt(start);
			if (!Character.isWhitespace(c))
				break;
			start++;
		}
		return str.substring(start);
	}

}