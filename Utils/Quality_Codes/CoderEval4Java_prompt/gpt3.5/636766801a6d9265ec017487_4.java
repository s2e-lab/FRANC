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
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '{' || ch == '}') {
				encodedString += URLEncoder.encode(Character.toString(ch));
			} else {
				encodedString += ch;
			}
		}
		return encodedString;
	}
} 

/**
 * Demo class to test UriComponent
 */
public class UriComponentDemo {
	public static void main(String[] args) {
		String exampleString = "https://example.com/api/{resource}/{id}";
		String encodedString = UriComponent.encodeTemplateNames(exampleString);
		System.out.println(encodedString); // Output: https://example.com/api/%7Bresource%7D/%7Bid%7D
	}
}