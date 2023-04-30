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
		if (str == null || prefix == null) {
			return false;
		}
		
		if (str.startsWith(prefix)) {
			return true;
		}
		
		final int len = prefix.length();
		if (len > str.length()) {
			return false;
		}
		
		boolean match = true;
		int off =0;
}
}