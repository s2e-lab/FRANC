import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUdfSource{
	/** 
	 * Gets a substring from the specified String avoiding exceptions. 
	 */
	
	public static String sub(String str,int start,int end){
		if(str.charAt(start)>=' '){
			char[] chars=str.substring(start,end).toCharArray();
			if(chars.length==0){
				return "";
			}
	
			return new String(Arrays.copyOf(chars, chars.length));
		}
	
		return new String(Arrays.copyOf(str.toCharArray(),end-start));
	}

}