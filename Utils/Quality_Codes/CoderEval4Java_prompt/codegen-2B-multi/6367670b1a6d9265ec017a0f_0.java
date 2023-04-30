import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Case in-sensitive Checks if the String contains any character in the given set of string. 
	 */
	
	public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
		/**
		 * This function is used to check if a String is in the given set of characters and any character in the string is lowercase or not.
		 * @param str : String in which we need to consider for checking for any character in the given set of characters.
		 */
		for (String s : searchStrArray){
			if (str.contains(s.toLowerCase()) || str.contains(s.toUpperCase()))
				return true;
		}
		return false;
	}
}