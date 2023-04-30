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
		int len = str.length();
		char c;
		str = str.trim();

		int pos = str.length();
		while (pos-- > 0) {
			c = str.charAt(pos);
			if (Character.isWhitespace(c) == false) {
				return str;
			}
		}
		return "";
	}

}