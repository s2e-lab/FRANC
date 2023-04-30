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
		 if (null == str) { return str; } // no trim needed
		 int len = str.length();
		 StringBuffer w = new StringBuffer();
		 // find last non-space char
		 int i = -1;
}
}