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
			if(str == null || prefix == null)
				return false;
			if(str.length() < prefix.length())
				return false;
			for(int i=0;i<prefix.length();i++){
				char c1 = Character.toLowerCase(str.charAt(i));
				char c2 = Character.toLowerCase(prefix.charAt(i));
				if(c1 != c2)
					return false;
			}
			return true;
		}
}