import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Case in-sensitive Checks if the String contains any character in the given set of string. 
	 */
	
	public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
		
		String searchStr = "";
		String upperStr = str.toUpperCase();
		for(int i=0;i<searchStrArray.size(); i++){
			searchStr = searchStrArray.get(i);
			if(upperStr.contains(searchStr))
				return true;
		}
		
		return false;
	}
}
