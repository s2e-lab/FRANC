import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Case in-sensitive Checks if the String contains any character in the given set of string. 
	 */
	
	public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
		boolean containsAny = searchStrArray.size() > 0;
		for( String  searchStr :searchStrArray){
			containsAny = containsAny || str.toLowerCase().contains(searchStr.toLowerCase());
		}
		return containsAny;
	}
}