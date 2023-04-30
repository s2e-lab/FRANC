import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * <p>Check if a String ends with a specified suffix (optionally case insensitive).</p>
	 * @see String#endsWith(String)
	 * @param str  the String to check, may be null
	 * @param suffix the suffix to find, may be null
	 * @param ignoreCase inidicates whether the compare should ignore case(case insensitive) or not.
	 * @return <code>true</code> if the String starts with the prefix orboth <code>null</code>
	 */
	
	private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
			if (str == null || suffix == null) { // if any of the inputs is null, return false
		return false;
	}
	
	if (suffix.length() > str.length()) { // if the length of the suffix is greater than the length of the input string, return false
		return false;
	}
	
	int strOffset = str.length() - suffix.length(); // calculate the starting index of the suffix in the input string
	
	if (ignoreCase) { // if ignore case is set to true
		return str.regionMatches(true, strOffset, suffix, 0, suffix.length()); // compare the suffix with the substring of the input string starting at the calculated index, ignoring case
	} else {
		return str.regionMatches(strOffset, suffix, 0, suffix.length()); // compare the suffix with the substring of the input string starting at the calculated index, considering case
	}
}
}