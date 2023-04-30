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
			final int len = str.length();
			int pos = -1;
			for (int i=len; i>0; i--){
				char ch = str.charAt(i-1);
				if (Character.isWhitespace(ch)){
					str.setCharAt(i,'');
				} else {
					pos = i;
					break;
				}
			}
			return str.substring(pos+1);
	}
}