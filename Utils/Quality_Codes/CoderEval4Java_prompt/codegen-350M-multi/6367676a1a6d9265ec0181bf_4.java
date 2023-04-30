import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Turn the given Object into a String with single quotes if it is a String; keeping the Object as-is else.
	 * @param obj the input Object (e.g. "myString")
	 * @return the quoted String (e.g. "'myString'"),or the input object as-is if not a String
	 */
	
	public static Object quoteIfString(Object obj){
		if(obj instanceof String){
			return "'"+obj+"'";
		}else{
			return obj;
		}
	}
	
	/** 
	 * Escape the given String to become a double quoted String (e.g. "myString" becomes "\"myString\"")
	 * @param obj the input String
	 * @return the quoted String (e.g. "\"myString\""),or the input string as-is if not a String
	 */

	public static String quoteIfDouble(String obj){
}
}