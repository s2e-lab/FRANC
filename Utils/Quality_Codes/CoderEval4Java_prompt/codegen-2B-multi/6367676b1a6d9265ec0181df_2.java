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
		if (str == null || prefix == null || prefix.length() == 0){
			return false;
		}
		if (str.length() >= prefix.length()){
			return str.regionMatches(false, 0, prefix, 0, prefix.length());
		}
		return false;
	}

	public static void main(String[] args){
		Scanner  in = new Scanner(System.in);
		long    n = in.nextLong();
		long   temp = 2;
}
}