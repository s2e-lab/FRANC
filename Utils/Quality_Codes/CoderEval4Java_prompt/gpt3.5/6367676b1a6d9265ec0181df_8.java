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
			if(str == null || prefix == null || prefix.length() > str.length())
	            return false; // if either string is null or prefix is longer than str, it cannot start with prefix
	        
        String start = str.substring(0, prefix.length()); // get the prefix of the same length as prefix from str
        return start.equalsIgnoreCase(prefix); // compare the prefix from str with the input prefix ignoring case sensitivity
    }
}