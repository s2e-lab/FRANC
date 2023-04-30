import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Case in-sensitive Checks if the String contains any character in the given set of string. 
	 */
	
	public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
		boolean result = false;
		for (int i = 0; i < searchStrArray.size(); i++){
			String nextSearchStr = searchStrArray.get(i);
			result = containsAny(str,nextSearchStr);
			if (result) break;
		}
		return result;
	}
	
	private static boolean containsAny(String str,String target){
		int firstIndex = str.indexOf(target);
}
}