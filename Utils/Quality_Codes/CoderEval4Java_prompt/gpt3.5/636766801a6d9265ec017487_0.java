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
			try {
            String encoded = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '{') {
                    encoded += "%7B"; // percent-encode '{'
                } else if (c == '}') {
                    encoded += "%7D"; // percent-encode '}'
                } else {
                    encoded += c;
                }
            }
            return encoded;
        } catch (Exception e) {
            return null;
        } 
	}
	
	/**
	 * Encodes a string with template parameters values, using percent-encode as necessary.
	 * @param s the string with zero or more template parameters values
	 * @return the string with encoded template parameters values.
	 */
	
	public static String encodeTemplateValues(String s){
		try {
            String encoded = URLEncoder.encode(s, "UTF-8");
            return encoded;
        } catch (Exception e) {
            return null;
        }
	}
	
	/**
	 * Encodes a string as a whole, using percent-encode as necessary.
	 * @param s the string to be fully encoded
	 * @return the fully encoded string.
	 */
	
	public static String encodeUriComponent(String s){
		try {
            String encoded = URLEncoder.encode(s, "UTF-8");
            encoded = encoded.replaceAll("\\+", "%20"); // replace '+' with '%20'
            return encoded;
        } catch (Exception e) {
            return null;
        }
	}
}
