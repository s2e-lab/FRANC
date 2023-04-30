import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Case in-sensitive Checks if the String contains any character in the given set of string. 
	 */
	
	public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
		
		if(str == null || searchStrArray == null)
			return false;
		
		for(String searchStr : searchStrArray){
			if(str.contains(searchStr))
				return true;
		}
		
		return false;
	}
	
} 
