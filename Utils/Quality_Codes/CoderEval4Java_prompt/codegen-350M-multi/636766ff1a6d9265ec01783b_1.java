import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	
	public static String sub(String str,int start,int end){
		try{
			start = Integer.parseInt(str.substring(start,end));
			return str.substring(0,start);
		}catch(Exception e){
			
		}		
		return "";
	}
	
}

