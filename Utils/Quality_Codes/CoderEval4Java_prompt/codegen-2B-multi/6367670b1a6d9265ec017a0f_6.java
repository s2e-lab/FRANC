import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Case in-sensitive Checks if the String contains any character in the given set of string. 
	 */
	
	public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
		if(searchStrArray.size() == 0)
			return false;
		

		for(String cmpStr : searchStrArray){
			if(str.indexOf(cmpStr)!= -1)
				return true;
		}
		
		return false;
	}
	
	public static String upperCase(String str){
		return str.toUpperCase();
	}
	
	public static String lowerCase(String str){
		return str.toLowerCase();
	}
}
	
