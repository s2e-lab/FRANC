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
		if (str == null){
			return str;
		} // empty str
		int i=str.length();
		for (; i>=0; i-=2){
			if (!Character.isWhitespace(str.charAt(i-1)))
				break;
		} // empty str
		
		if (i<0)
			return ""; // no leftover whitespace
		
}
}