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
		return  (str.toLowerCase().startsWith(prefix.toLowerCase()));
	}
	/**
	 * Returns a string with backslashes doubled
	 */
	public static String doubleBackSlashes(String arg, String pattern){
		if(pattern.equals(".")){
			return "%2E";
		}else{
			return arg.replace(pattern, "");
		}
	}
	
	public static String repeatChar( final String str, final int times ) { // create a string with the repeating character.
}
}