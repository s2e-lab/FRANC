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
			String line = "";
			StringBuffer result = new StringBuffer();
			while(line.length()!= 0){
				if(line.charAt(line.length() - 1) <= 32){
					result.append(line);
				}
				line = line.replaceFirst(line.substring(0, line.length() - 1), "\r\n\t");
			}
			return result.toString();
	}
	
}