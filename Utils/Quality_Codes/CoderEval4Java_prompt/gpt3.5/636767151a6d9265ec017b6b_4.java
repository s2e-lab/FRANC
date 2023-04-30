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
				return (str == null && prefix == null);
			}
			if (prefix.length() > str.length()) {
				return false;
			}
			String compareStr = str.substring(0, prefix.length());
			if (ignoreCase) {
				return compareStr.equalsIgnoreCase(prefix);
			}
			else {
				return compareStr.equals(prefix);
			}
	}
	
	/**
	 * <p>Check if a String starts with any of the specified prefixes (optionally case insensitive).</p>
	 * @param str the String to check, may be null
	 * @param prefixes the prefixes to find, may be null or empty
	 * @param ignoreCase inidicates whether the compare should ignore case(case insensitive) or not.
	 * @return <code>true</code> if the String starts with any of the prefixes or both <code>null</code>
	 */
	public static boolean startsWithAny(final String str,final String[] prefixes,final boolean ignoreCase){
		if(str == null || prefixes == null || prefixes.length == 0){
			return false;
		}
		for(String prefix : prefixes){
			if(startsWith(str, prefix, ignoreCase)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * <p>Check if a String ends with a specified suffix (optionally case insensitive).</p>
	 * @see String#endsWith(String)
	 * @param str  the String to check, may be null
	 * @param suffix the suffix to find, may be null
	 * @param ignoreCase indicates whether the compare should ignore case (case insensitive) or not.
	 * @return <code>true</code> if the String ends with the suffix or both <code>null</code>
	 */
	
	public static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
			if (str == null || suffix == null) {
				return (str == null && suffix == null);
			}
			if (suffix.length() > str.length()) {
				return false;
			}
			String compareStr = str.substring(str.length() - suffix.length());
			if (ignoreCase) {
				return compareStr.equalsIgnoreCase(suffix);
			}
			else {
				return compareStr.equals(suffix);
			}
	}
	
}