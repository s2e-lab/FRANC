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
			StringBuffer encodedStr = new StringBuffer();
		try {
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if(c == '{') {
					encodedStr.append("%7B"); // encoding for '{'
				}else if(c == '}') {
					encodedStr.append("%7D"); // encoding for '}'
				}else {
					encodedStr.append(c);
				}
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		return encodedStr.toString();
	} 
}