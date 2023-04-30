import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
		return object == null? null: object.toString();
	}
/*
	
	static public String replaceString(String string,String search, String replace) {
		if(string == null) {
			return null;
		}
		StringBuilder out = new StringBuilder();
		out.append(string);
		int s = string.indexOf(search);
		out.replace(s, s + search.length(), replace);
		return out.toString();
	}
*/
}