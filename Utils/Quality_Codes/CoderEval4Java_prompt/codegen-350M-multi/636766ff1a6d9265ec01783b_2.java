import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	
	public static String sub(String str,int start,int end){
		
		if(start <0 || start > str.length()){
			return null;
		}
		
		return str.substring(start,end);
	}
	
}

