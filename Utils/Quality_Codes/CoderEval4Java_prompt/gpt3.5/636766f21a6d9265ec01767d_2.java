import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
			return object != null ? object.toString() : null;
	}
	
	/** 
	 * Returns true if the specified string is null or empty. 
	 */
	
	public static boolean isNullOrEmpty(String string){
		return string == null || string.isEmpty();
	}
	
	/** 
	 * Returns true if the specified string is not null and not empty. 	
	 */
	
	public static boolean isNotNullOrEmpty(String string){
		return string != null && !string.isEmpty();
	}
	
	/** 
	 * Returns the specified string with the first letter capitalized. 
	 */
	
	public static String capitalize(String string){
		if(string == null || string.isEmpty()){
			return string;
		}
		return string.substring(0,1).toUpperCase() + string.substring(1);
	}
	
	/** 
	 * Returns the specified string with the first letter in lowercase. 
	 */
	
	public static String uncapitalize(String string){
		if(string == null || string.isEmpty()){
			return string;
		}
		return string.substring(0,1).toLowerCase() + string.substring(1);
	}
	
	/** 
	 * Returns a substring of the specified string based on the specified indices. 
	 */
	
	public static String substring(String string, int startIndex, int endIndex){
		if(string == null || string.isEmpty()){
			return string;
		}
		if(startIndex < 0 || endIndex > string.length()){
			return null;
		}
		return string.substring(startIndex, endIndex);
	}
	
	/** 
	 * Returns the specified string with all whitespace characters removed. 
	 */
	
	public static String removeWhitespace(String string){
		if(string == null || string.isEmpty()){
			return string;
		}
		return string.replaceAll("\\s+", "");
	}
}
