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
			if(str == null || prefix == null){
//if either of the strings is null, return false
    return false;
}
if(prefix.length() > str.length()){
//if prefix is longer than the string, it obviously doesn't start with the string
    return false;
}
if(ignoreCase){
//if we need to check case insensitivity, convert both strings to lower case
    return str.toLowerCase().startsWith(prefix.toLowerCase());
}else{
//otherwise, just use the basic startsWith method
    return str.startsWith(prefix);
}
}
}