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
			if(str.length() < prefix.length()){
			return false;
		}
		
		// Check if the prefix is the same length as the entire string
		if(str.length() == prefix.length()){
			return str.equalsIgnoreCase(prefix);
		}
		
		// Check if the prefix matches the start of the string ignoring case
		for(int i = 0;i < prefix.length();i++){
			char c1 = Character.toUpperCase(str.charAt(i));
			char c2 = Character.toUpperCase(prefix.charAt(i));
			
			if(c1 != c2){
				return false;
			}
		}
		
		return true;
	}
}