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
		 return new String(Character.isWhitespace(str.charAt(str.length()-1))
		 || (str.endsWith("\n") && str.endsWith("\r"))? str.substring(0,str.length()-1)
		 : str);//$NON-NLS-1$	str.equals("") || str.equals("  ")? ""
}
}