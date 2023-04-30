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
		try{
			for(int i=0; i<s.length(); i++){
				char currentChar = s.charAt(i);
				if(currentChar == '{' || currentChar == '}'){
					//percent-encode the character
					encodedString += "%" + Integer.toHexString((int)currentChar).toUpperCase();
				}
				else{
					encodedString += currentChar;
				}
			}
		}catch(Exception e){
			System.err.println("An exception occurred: " + e.getMessage());
		}
		return encodedString;
	}
		
	/** 
	 * Decodes a string with template parameters names present, specifically the characters '{' and '}' will be percent-decoded.
	 * @param s the string with zero or more template parameters names
	 * @return the string with decoded template parameters names.
	 */
	
	public static String decodeTemplateNames(String s){
		String decodedString = "";
		try{
			for(int i=0; i<s.length(); i++){
				char currentChar = s.charAt(i);
				if(currentChar == '%'){
					//decode the percent-encoded character
					String hex = "" + s.charAt(i+1) + s.charAt(i+2);
					int decimal = Integer.parseInt(hex, 16);
					decodedString += (char)decimal;
					i += 2;
				}
				else{
					decodedString += currentChar;
				}
			}
		}catch(Exception e){
			System.err.println("An exception occurred: " + e.getMessage());
		}
		return decodedString;
	}
}