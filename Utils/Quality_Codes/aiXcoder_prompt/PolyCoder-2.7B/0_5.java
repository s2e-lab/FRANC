import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID0{
	/**
	* Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to "a, b and c".
	*/
	public static String collectionToCommaDelimitedString(List<String> coll){
			String result = "";
			
				for (String s : coll){
					if (result.length() == 1 && result.indexOf(",") < 0)
					{
				        result += ","; 
					}
					result += ":"+s;
				}
				return result;
		}
	
	private String str1;
	private String str2;
	private boolean isNumber() {
}
}