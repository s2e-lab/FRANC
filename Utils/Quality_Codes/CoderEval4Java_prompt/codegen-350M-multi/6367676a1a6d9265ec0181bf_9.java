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
		if (obj instanceof String)
			return obj;
		else
			return quote(obj);
	}
	
	/** 
	 * Write a String to the outputfile, quoting the contents.
	 * @param out the FileWriter with the outputfile (e.g. "C:/Python35/ipython3.6/bin/ipython")
	 */
	public static void writeToFile(File outFile, Object writeToFileArgs){
		OutputStream stream = null;
}
}