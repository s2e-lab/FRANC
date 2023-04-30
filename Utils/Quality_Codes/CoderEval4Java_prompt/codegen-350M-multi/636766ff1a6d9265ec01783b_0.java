import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	
	public static String sub(String str,int start,int end){
		if (start>end) return null;
		return new String(str.substring(start,end));
	}
		
	
	/** 
	 * Gets a substring of the specified String avoiding exceptions. 
	 */
	
	
	public static String get(String str,int start,int end){
		return new String(str.substring(start,end));
	}
	
	
			
	/** 
	 * Gets a substring of the specified String avoiding exceptions
	 */
	
	
}