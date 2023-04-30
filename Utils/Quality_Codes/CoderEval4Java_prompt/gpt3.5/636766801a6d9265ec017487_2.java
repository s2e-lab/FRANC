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
			// First, we need to convert '{' and '}' characters to their percent-encoded values
		String encodedString = s.replaceAll("\\{","%7B").replaceAll("\\}","%7D");
		return encodedString;
	}
	
	/** 
	 * Encodes a string with template parameter values present, specifically the character '/' will be percent-encoded.
	 * @param s the string with zero or more template parameter values
	 * @return the string with encoded template parameter values.
	 */
	
	public static String encodeTemplateValues(String s){
		// First, we need to convert '/' character to its percent-encoded value
		String encodedString = s.replaceAll("/","%2F");
		return encodedString;
	}
	
	/** 
	 * Decodes a percent-encoded string back to its original form.
	 * @param s the string to be decoded
	 * @return the decoded string.
	 */
	
	public static String decode(String s){
		// Decoding the string with URLDecoder class
		String decodedString = java.net.URLDecoder.decode(s);
		return decodedString;
	}
	
	public static void main(String args[]){
		// Test the methods
		String s1 = "{category}/{id}";
		System.out.println(encodeTemplateNames(s1));
		
		String s2 = "Electronics/Cell Phones & Accessories";
		System.out.println(encodeTemplateValues(s2));
		
		String s3 = "Electronics%2FCell+Phones+%26+Accessories";
		System.out.println(decode(s3));
	}
}