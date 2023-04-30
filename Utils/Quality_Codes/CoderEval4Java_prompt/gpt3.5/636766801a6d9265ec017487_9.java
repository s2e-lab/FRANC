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
	
	String encodedString = URLEncoder.encode(s.replaceAll("\\{", "%7B").replaceAll("\\}", "%7D"), "UTF-8"); // replace '{' with '%7B' and '}' with '%7D', then encode using UTF-8
	return encodedString;
	
}catch(Exception e){
	System.out.println("Error: " + e.getMessage());
	return null;
}
} 

/**
 * Decodes a string with template parameters names present, specifically the characters '{' and '}' will be percent-encoded.
 * @param s the string with encoded template parameters names
 * @return the string with decoded template parameters names.
 */
public static String decodeTemplateNames(String s){
	try{
		
		String decodedString = URLDecoder.decode(s, "UTF-8").replaceAll("%7B", "\\{").replaceAll("%7D", "\\}"); // decode using UTF-8 and then replace '%7B' with '{' and '%7D' with '}'
		return decodedString;
		
	}catch(Exception e){
		System.out.println("Error: " + e.getMessage());
		return null;
	}
}

	public static void main(String[] args) {
		String s = "http://example.com/{id}/endpoint";
		String encoded = encodeTemplateNames(s);
		System.out.println(encoded); // should print "http%3A%2F%2Fexample.com%2F%7Bid%7D%2Fendpoint"
		String decoded = decodeTemplateNames(encoded);
		System.out.println(decoded); // should print "http://example.com/{id}/endpoint"
	}
}