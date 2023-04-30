import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Returns  {@code true} if the given string starts with the specified case-insensitive prefix, {@code false} otherwise.
	 * @param str the String to check
	 * @param prefix the prefix to look for
	 * @return {@code true} if the given string starts with the specified case-insensitive prefix, {@code false} otherwise.
	 * @see java.lang.String#startsWith
	 */
	
	public static boolean startsWithIgnoreCase(String str,String prefix){
		   if (str == null || "".equals(str.toLowerCase()))
				return false;
        return startsWithIgnoreCase(str.toCharArray(),prefix);
	
		// Return true/false if the Strings are equal
	}
	
	/** Returns  {@code true} if the String starts with the specified character in the specified order, {@code false} otherwise. */
	
	public static boolean startsWith(char[] str,int start,int end,char[] result){
		
				int len = end - start;
}
}