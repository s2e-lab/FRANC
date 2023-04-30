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
		int len = str.length();
		char[] ch = str.toCharArray();
		int i = 0;
		while(Character.isWhitespace(ch[i])){
			i++;
		}
		return (i == 0)? str : new String(ch, i, len - i);
	}

}