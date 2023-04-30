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
		str=str.trim();

		for(int i=0; i<str.length(); i=str.offsetByCodePoints(0,1)){
			if(!Character.isWhitespace(str.codePointAt(i)))
				return str.substring(i);
		}
		return "";
	}


}