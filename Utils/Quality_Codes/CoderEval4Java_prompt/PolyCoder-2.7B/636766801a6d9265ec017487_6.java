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
		 return UriComponent.encode("{}", s);
	}
	
	/**
	 * Encodes a map with string values as 'name=value' parameters, name,value pairs as an array of '&lt;name,value&gt;'
	 * @param map the map to be encoded. It needs the name as the first name and the value as the second.
	 * @return the encoded map.
	 */
	
	public static String encodeMap(Map<String, String> map){
		String result="";
}
}