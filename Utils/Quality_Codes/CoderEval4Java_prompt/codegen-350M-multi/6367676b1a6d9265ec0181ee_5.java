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
		int size = str.length() - 1; // don't skip the last element
		for (int i = size; i >= 0; i--) {
			if (Character.isWhitespace(str.charAt(i))) {
				size = i;
				break;
			}
		}
}
}