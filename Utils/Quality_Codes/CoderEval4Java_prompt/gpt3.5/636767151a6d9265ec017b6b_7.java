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
			if (str == null || prefix == null) {
			return str == null && prefix == null;
		}
		if (prefix.length() > str.length()) {
			return false;
		}
		if (ignoreCase) {
			return str.toLowerCase(Locale.ROOT).startsWith(prefix.toLowerCase(Locale.ROOT));
		} else {
			return str.startsWith(prefix);
		}
	}
} 

/* The above code is a implementation of a method startsWith() in class StringUtils, which is used to check if a String starts with a specified prefix (optionally case insensitive). This implementation takes three parameters:
- str: the String to check, may be null
- prefix: the prefix to find, may be null
- ignoreCase: indicates whether the compare should ignore case(case insensitive) or not.
It returns true if the String starts with the prefix or both are null, otherwise false. */