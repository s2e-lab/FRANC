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
			int length = str.length();
			boolean result = true;
			for(;length>0;){
				if(prefix.equals(str.substring(0,length))){
					result = false;
				}

				str = str.substring(0,length);
			}
			return result;
	}
	
	public static boolean startsWith(String str,String prefix){
		int length = str.length();		
	    int len = prefix.length();
	    int index = 0;
	  
}
}