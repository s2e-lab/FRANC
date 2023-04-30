import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	
	public static String sub(String str,int start,int end){
		//Check if the string doesn't get too long. 
		if(start<=0 || end ==str.length()){
			return str.substring(0,1);
		} else {
			return str.substring(start,end);
		}
	}
	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	
	public static String subWithOffset(String str,int offset,int end){
		//Check if the string doesn't get too long. 
}
}