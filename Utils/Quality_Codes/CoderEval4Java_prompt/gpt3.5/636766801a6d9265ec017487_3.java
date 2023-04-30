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
			try{
		    String encoded = URLEncoder.encode(s.replace("{", "%7B").replace("}", "%7D"), "UTF-8");
		    return encoded;
		} catch (UnsupportedEncodingException e){
		    System.out.println("Unsupported Encoding Exception: " + e.getMessage());
		    return "";
		}
	}
	
	/**
	 * Encodes a string with template parameter values present, specifically all non-alphanumeric characters will be percent-encoded.
	 * @param s the string with zero or more template parameter values
	 * @return the string with encoded template parameter values.
	 */
	
	public static String encodeTemplateValues(String s){
		try{
		    String encoded = URLEncoder.encode(s, "UTF-8").replace("+", "%20");
		    return encoded;
		} catch (UnsupportedEncodingException e){
		    System.out.println("Unsupported Encoding Exception: " + e.getMessage());
		    return "";
		}
	}
}