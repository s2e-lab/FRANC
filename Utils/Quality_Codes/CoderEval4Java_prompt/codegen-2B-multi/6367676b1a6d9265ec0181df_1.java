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
		if (str==null) return false;
		if (prefix==null||prefix.length()==0) return true;
		if (str.length()<prefix.length())
			return false;
		return str.regionMatches(true,0,prefix,0,prefix.length());
	}


	public static boolean isEmpty(String s){
	return s == null || s.length() == 0;
	}


	public static boolean isNotEmpty(String s){
		return s!= null && s.length() > 0;
	}
}