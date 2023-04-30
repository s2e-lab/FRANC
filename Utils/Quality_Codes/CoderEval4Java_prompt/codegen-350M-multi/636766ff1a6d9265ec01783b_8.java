import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	
	public static String sub(String str,int start,int end){
		if(str==null || start>=str.length() || end<=0)
			return null;
		else
			return (str.substring(start,end));
	}
	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	public static String substring(String str,int start,int end){
		if(str==null || start>=str.length() || end<=0)
			return null;
}
}