import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			if (str == null || str.isEmpty() || trailing == null || trailing.length() == 0)
					return str;
			str = str.concat(trailing);
		    return str;
	}
	/**
	 * If the given string is null, returns the string passed in, otherwise
	 * returns a string passed in with a space appended to what ever is given
	 */
	public static String getSpace(String s){
		int length = s.length();
		if (length==0)
			return s;
		

}
}