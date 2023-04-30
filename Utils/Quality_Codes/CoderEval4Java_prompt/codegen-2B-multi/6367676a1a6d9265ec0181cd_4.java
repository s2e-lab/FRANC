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
		if (str == null || str.length() == 0) {
			return str;
		}
		int i = 0;
		while (i < str.length()) {
			if (!Character.isWhitespace(str.charAt(i))) {
				break;
			}
			i++;
		}
		return str.substring(i);
	}


}