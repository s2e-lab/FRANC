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
		 return startsWithIgnoreCase(str,prefix,0);
	}
	/** 
	 * Returns  {@code true} if the given string starts with the specified prefix, {@code false} otherwise.
	 * @param str the String to check
	 * @param prefix the prefix to look for
	 * @return {@code true} if the given string starts with the specified prefix, {@code false} otherwise.
	 */
	
	
	public static boolean startsWithIgnoreCase(String str,String prefix){
	
		int len=str.length();
}
}