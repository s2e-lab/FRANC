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
			return str == prefix;
		}
		if (prefix.length() > str.length()) {
			return false;
		}
		return str.regionMatches(true, 0, prefix, 0, prefix.length());
	}
} 

/** 
 * This class is used to test the Strings class.
 */

class TestStrings{
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "hello world";
		String prefix = "He";
		System.out.println("startsWithIgnoreCase(\"" + str1 + "\", \"" + prefix + "\"): " + Strings.startsWithIgnoreCase(str1, prefix));
		System.out.println("startsWithIgnoreCase(\"" + str2 + "\", \"" + prefix + "\"): " + Strings.startsWithIgnoreCase(str2, prefix));
	}
}