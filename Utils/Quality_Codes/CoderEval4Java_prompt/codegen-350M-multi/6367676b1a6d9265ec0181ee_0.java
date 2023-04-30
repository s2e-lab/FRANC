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
		int lastSpace=-1;
		int i=str.length();
		while(--i>=0 && Character.isSpaceChar(str.charAt(i)))
			lastSpace=i;
		return lastSpace==-1?str:str.substring(0, lastSpace+1);
	}
	
	private static final boolean DEBUG=false;
	
}