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
			if(str==null){
		 		return true;
			}
			else{
			if(prefix.length()==0){
		 		return str.startsWith(prefix);
		 		}
		 		else{
				return startsWith(str,prefix);
		 		}		    
		 }
		 
	}	
	
	public static boolean isNotEmpty(String s){
			String[] array = s.split(Character.MAX_VALUE);
}
}