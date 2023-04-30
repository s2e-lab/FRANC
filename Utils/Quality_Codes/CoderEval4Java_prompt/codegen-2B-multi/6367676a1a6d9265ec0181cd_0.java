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
		if(!containsWhitespaces(str))
			return "";
		for(int i =0;i < str.length();i++){
			char c = str.charAt(i);
			switch (c){
			case '\t':
			case '\n':
			case '\r':
				return "";
			default:
				return str.substring(i);
			}
		}
		return "";
	}
	
	
}