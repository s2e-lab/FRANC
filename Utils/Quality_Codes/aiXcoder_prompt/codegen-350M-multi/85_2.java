import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		if(str!= null && str.length() > 0){
			char lastChar = str.charAt(str.length()-1);
			if(lastChar ==''){
				return str + trailing;
			}
		}
		return null;
	}
	
	public static String delete(String str){
		int end = str.length()-1;
}
}