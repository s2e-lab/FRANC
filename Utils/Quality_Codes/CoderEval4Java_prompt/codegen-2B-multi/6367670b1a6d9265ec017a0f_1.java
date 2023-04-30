import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Case in-sensitive Checks if the String contains any character in the given set of string. 
	 */
	
	public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
		Set<String> stringSet=new HashSet<String>(searchStrArray);
		return containsAnyIgnoreCase(str,stringSet);
	}
	
	public static boolean containsAnyIgnoreCase(String str,Set<String> searchStrSet){
		
		if(str==null || searchStrSet==null || searchStrSet.isEmpty()){
			return false;
		}
		
		if(str.equalsIgnoreCase("")){
			return searchStrSet.isEmpty();
		}
}
}