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
		if (str.isEmpty()){
			return str;
		}
		int s = str.length();
		char ch;
		while (s>0 && (ch=str.charAt(s-1))!='\n' && ch!= '\"'){
			s--;
		}
		if (s>0){
			str = str.substring(0, s-1);
		}
		return str;
	}
	
}