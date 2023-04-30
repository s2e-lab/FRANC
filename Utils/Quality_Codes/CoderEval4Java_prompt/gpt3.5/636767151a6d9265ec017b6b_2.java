import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * <p>Check if a String starts with a specified prefix (optionally case insensitive).</p>
	 * @see String#startsWith(String)
	 * @param str  the String to check, may be null
	 * @param prefix the prefix to find, may be null
	 * @param ignoreCase inidicates whether the compare should ignore case(case insensitive) or not.
	 * @return <code>true</code> if the String starts with the prefix orboth <code>null</code>
	 */
	
	private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
			if (str == null || prefix == null){
		return str == null && prefix == null;
	}
	// Check if prefix is longer than str
	if (prefix.length() > str.length()){
		return false;
	}
	// Check if prefix is empty
	if (prefix.isEmpty()){
		return true;
	}
	// Perform comparison based on ignoreCase
	if (ignoreCase){
		return str.regionMatches(true, 0, prefix, 0, prefix.length());
	}else{
		return str.startsWith(prefix);
	}
}
}