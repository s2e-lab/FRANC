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
			if (str == null || suffix == null) {
		return (str == suffix);
	}
	if (suffix.length() > str.length()) {
		return false;
	}
	int strOffset = str.length() - suffix.length();
	if (ignoreCase) {
		return str.regionMatches(true, strOffset, suffix, 0, suffix.length());
	} else {
		return str.regionMatches(strOffset, suffix, 0, suffix.length());
	}
}

/**
* <p>Check if a String contains only unicode letters, digits or space (' ').</p>
* Null will return false. An empty string will return true.
* @param str  the String to check, may be null
* @return <code>true</code> if the String contains only Unicode letters or digits or space,
*  and is non-null
**/

public static boolean isAlphaNumericSpace(final String str) {
	if (StringUtils.isEmpty(str)) {
		return false;
	}
	final int sz = str.length();
	for (int i = 0; i < sz; i++) {
		if (!Character.isLetterOrDigit(str.charAt(i)) && str.charAt(i) != ' ') {
			return false;
		}
	}
	return true;
}

/**
* <p>Check if a String is empty ("") or null.</p>
* @param str  the String to check, may be null
* @return <code>true</code> if the String is empty or null
**/

public static boolean isEmpty(final String str) {
	return str == null || str.length() == 0;
}

/**
* <p>Check if a String is not empty ("") and not null.</p>
* @param str  the String to check, may be null
* @return <code>true</code> if the String is not empty and not null
**/

public static boolean isNotEmpty(final String str) {
	return !StringUtils.isEmpty(str);
}

/**
* <p>Check if a String is whitespace, empty ("") or null.</p>
* @param str  the String to check, may be null
* @return <code>true</code> if the String is null, empty or whitespace
**/

public static boolean isBlank(final String str) {
	int strLen;
	if (str == null || (strLen = str.length()) == 0) {
		return true;
	}
}
}