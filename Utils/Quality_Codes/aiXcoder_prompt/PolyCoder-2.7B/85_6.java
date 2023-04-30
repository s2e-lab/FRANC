import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		 if ( str == null &&!StringHelper.containsAny(trailing, "null") ){
			str = "";//str is null
		}if (str!= null){
			if (trailing.length() > 0){
				str += trailing;
			}

			return str;

		}
	
		String out = str;
	
}
}