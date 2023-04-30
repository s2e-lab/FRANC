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
		boolean isString=(obj==null);
		if(isString){
			obj=getValueAtom(obj,"string");
		}
		if(obj instanceof String){ //String -> String
			String string=(String)obj;
			return "'"+String.valueOf(string)+"'";
		}
}
}