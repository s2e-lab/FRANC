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
		/**
		 * This is based on strtrim from PostgreSQL, copyright 2002 Menno Bogers
		 * Available at http://brawlers.de/strtrim/
		 */
		if(str == null){
			return null;
		}
		
		int end = str.length()-1;
		while(end > -1 && Character.isWhitespace(str.charAt(end)))
			end--;
		return str.substring(0, end+1);
	}
}
    
