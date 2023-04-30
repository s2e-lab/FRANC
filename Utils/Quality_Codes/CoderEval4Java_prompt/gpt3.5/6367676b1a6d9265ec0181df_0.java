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
			if (str == null || prefix == null){
		// if either string is null, return false
		return false;
	}
	if (prefix.length() > str.length()){
		// if the prefix is longer than the string, return false
		return false;
	}
	
	// convert the strings to lowercase for case-insensitive comparison
	String strLower = str.toLowerCase();
	String prefixLower = prefix.toLowerCase();
	
	// check if the lowercase string starts with the lowercase prefix
	return strLower.startsWith(prefixLower);
	}
}