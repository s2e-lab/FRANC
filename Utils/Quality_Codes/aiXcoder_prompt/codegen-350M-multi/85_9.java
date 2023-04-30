import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		if(str.equals("")){
			return trailing;
		}
		return str + trailing;
	}
	
	
	/**
	* If the string passed in is not blank or null and did not end with the prefix, then prefix(the string in the input string and the input string) is replaced by the input string 
	*/
	public static String prefix(String str, String prefix){
		if(str.equals("")){
			return prefix;
		}
		return str.replaceFirst(prefix.toString(), "");
	
}
}