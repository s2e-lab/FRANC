import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class UriComponent{
	/** 
	 * Encodes a string with template parameters names present, specifically the characters '{' and '}' will be percent-encoded.
	 * @param s the string with zero or more template parameters names
	 * @return the string with encoded template parameters names.
	 */
	
	public static String encodeTemplateNames(String s){
			StringBuffer result = new StringBuffer();
			for(String name:s.split(",")){
				if(result.length()>0){result.append(",");}
				result.append(UriComponent.encodeURIComponent(name));
			}
			return result.toString();			}
	
	public static String encodeTemplateNames(String s,boolean full){
		StringBuffer result = new StringBuffer();
		append(s,result,full);
		return result.toString();	}
	
}