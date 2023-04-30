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
			String encodedString = "";
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == '{'){
				encodedString += "%7B";
			}
			else if(c == '}'){
				encodedString += "%7D";
			}
			else{
				encodedString += c;
			}
		}
		return encodedString;
	}
	
	/**
	 * Encodes a string with all characters that are not a-z, A-Z, 0-9, '-', '.', '_', '~' or '%', replaced by their hexadecimal ASCII representation.
	 * @param s the string to be encoded
	 * @return the encoded string
	 */
	 
	public static String encode(String s){
		try{
			return URLEncoder.encode(s, "UTF-8")
				.replaceAll("\\+", "%20")
				.replaceAll("%21", "!")
				.replaceAll("%27", "'")
				.replaceAll("%28", "(")
				.replaceAll("%29", ")")
				.replaceAll("%7E", "~");
		} catch(Exception e){
			return s;
		}
	}
	
	/**
	 * Decodes a URI component with all hexadecimal representation replaced by their ASCII character.
	 * @param s the URI component to be decoded
	 * @return the decoded string.
	 */
	 
	public static String decode(String s){
		try{
			return URLDecoder.decode(s, "UTF-8");
		} catch(Exception e){
			return s;
		}
	}
}