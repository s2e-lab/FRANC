import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Case in-sensitive Checks if the String contains any character in the given set of string. 
	 */
	
	public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
		if(searchStrArray.size()==0){
			return false;
		}
		String pattern = "";
		for (String searchString : searchStrArray) {
			pattern = pattern +"*"+ searchString +"*";
		}
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		if(m.matches())
			return true;
		return false;		
	}
}

