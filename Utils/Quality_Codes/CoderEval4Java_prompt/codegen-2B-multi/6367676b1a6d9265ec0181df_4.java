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
		return str.regionMatches(true,0,prefix,0,prefix.length());
    }
	
 
    public static String findSubstring(String str, String subStr, String separator) {
        String[] spn = substringBefore(subStr, separator).split(separator);
        String[] substr = substringBefore(str, separator).split(separator);
        int length = spn.length;
        int i;
}
}