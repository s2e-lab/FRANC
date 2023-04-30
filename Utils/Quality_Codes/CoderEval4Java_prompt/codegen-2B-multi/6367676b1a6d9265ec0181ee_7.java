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
		int ln=str.length();
		if(ln==0){
			return "";
		}
		int i=ln-1;
		while(Character.isWhitespace(str.charAt(i))&&i>=0){
			i--;
		}
		return str.substring(0,i+1);
	}

}