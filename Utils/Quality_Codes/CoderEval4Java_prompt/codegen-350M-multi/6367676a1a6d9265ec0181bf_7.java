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
		String str = obj == null? "null" : obj.toString();
		if (str.startsWith("'") && str.endsWith("'")) return "'" + str.substring(1, str.length()-1) + "'";
		return obj;
	}
	public  static void writeToFileToStream (InputStream in, File outputFile) throws IOException{
		FileOutputStream out = new FileOutputStream(outputFile);
		IOUtil.copy(in, out);
	}

}
