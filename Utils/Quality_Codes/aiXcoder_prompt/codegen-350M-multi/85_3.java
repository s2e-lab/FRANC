import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		if(str == null || str.equals("") || trailing == null || trailing.equals("") || str.endsWith(trailing))
			return str;
		else
			return str+trailing;
	}
	
	
	public static String trimAll(String str, String charsToRemove){
		return str.replaceAll(charsToRemove,"");
	}
	
	
	public static Map<String,Integer> getID8Values(Reader input) throws IOException{
		String buffer = "";
		
}
}