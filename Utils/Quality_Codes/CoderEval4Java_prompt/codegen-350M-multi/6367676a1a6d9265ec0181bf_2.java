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
		
		String s = quoteIfString(obj.toString());
		if (s.endsWith("\"") &&!s.endsWith("'")){
			s = s.substring(0, s.length()-1);
		}
		return obj;
	}
	
	/** 
	 * 
	 * @param s the input String
	 * @param quote the quote symbol which terminates each string character and will end the string
	 * @return the quoted string
	 */
	
}