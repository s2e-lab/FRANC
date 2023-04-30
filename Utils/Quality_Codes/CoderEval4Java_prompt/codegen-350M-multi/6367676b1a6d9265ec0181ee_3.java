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
		if (str == null || str.indexOf('\r') > 0 || str.indexOf('\n') > 0){
			return str;
		}
		
		char ch = 0;
		for (int i=str.length()-1; i >= 0; i--){
			ch = str.charAt(i);
			if (Character.isWhitespace(ch)){
				return str.substring(0, i+1);
			}
		}
		return str;
	}
	
	
}