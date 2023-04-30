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
		return str.trim().replace(' ','\0');
	}

	/**
	 * Count the number of times that the given substring is
	 * contained in the given string.
	 * @param str the String to check
	 * @param sub the substring
	 * @return the number of times that the substring is found in the String
	 */
	private static int strStr(String str, String sub){
		int idx = str.indexOf(sub);

		if (idx == -1)
			return 0;

}
}