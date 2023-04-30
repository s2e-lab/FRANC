import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID0{
	/**
	* Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to "a, b and c".
	*/
	public static String collectionToCommaDelimitedString(List<String> coll){
		 StringBuffer sb = new StringBuffer();
		 int len = coll.size();
		 for(int j = 0; j < len; j++ ){
		 sb.append(coll.get(j) + ", "); //$NON-NLS-1$
		 }
		return sb.toString();
	}
	/**
	* Split a string from a list of "to" strings 
	*/
	public static String[] split(String string){
		String[] sub = null;
			  
}
}