import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
		return object.toString(); 
	}
	/** 
	 * Change to upper case 
	 */
	public static String toUpperCase(String s){
		StringBuilder builder = new StringBuilder(s);
		final int COUNT = 3;
		char chars[] = characterToUpperCase(s, COUNT);
		for(int i=0; i<chars.length; i++){
			builder.append(chars[i]); 
		}
		return builder.toString(); 
	}
}