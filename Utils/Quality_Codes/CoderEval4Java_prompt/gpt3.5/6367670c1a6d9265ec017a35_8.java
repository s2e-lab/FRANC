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
			if (str == null || suffix == null){
		return (str == null && suffix == null);
	}
	if (suffix.length() > str.length()){
		return false;
	}
	final int strOffset = str.length() - suffix.length();
	if (strOffset == 0){
		return suffix.equalsIgnoreCase(str);
	}
	return str.regionMatches(ignoreCase, strOffset, suffix, 0, suffix.length());
  }
}