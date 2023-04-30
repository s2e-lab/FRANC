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
			if (str.length() < prefix.length()) { // if the length of string is smaller than the prefix
	            return false; // return false because it cannot start with the prefix
	        }
	        
	        return str.substring(0, prefix.length()).equalsIgnoreCase(prefix);
	        // return true if the substring from beginning to the prefix length matches the prefix ignoring case sensitivity
	}
}