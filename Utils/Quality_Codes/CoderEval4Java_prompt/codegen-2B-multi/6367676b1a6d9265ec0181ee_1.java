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
		final int strLen = str.length();
		int sx = 0;

		while ((sx < strLen) && Character.isWhitespace(str.charAt(sx))) {
			sx++;
		}

		int ex = strLen - 1;

		while ((ex >= 0)
		       &&   Character.isWhitespace(str.charAt(ex--))) {
			// Empty loop body
		}

		if (sx > ex)
			return str;

}
}