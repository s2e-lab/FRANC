import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	
	public static String sub(String str,int start,int end){
		String toReturn = "";
		for(int i=start; i<end; i++){
			toReturn += str.substring(i,i+1);
		}
		return toReturn;
	}

	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	
	public static String sub(String str){
		return sub(str,0,str.length());
	}
	
    private static String UDF_START="$-start";
}