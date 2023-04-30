import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			return (trailing!= null)? str.concat(trailing) : str;
	}
	/**
	 * If the string passed in is not blank then the trailing value gets replaced by the passed in string
	 * @param str
	 */
	public static String trimTrailing(String str){
		if(str.endsWith(TRAILING_VALUE)){
				str = str.substring(0, str.length()-TRAILING_VALUE.length());
		}
		return str;
	}
}