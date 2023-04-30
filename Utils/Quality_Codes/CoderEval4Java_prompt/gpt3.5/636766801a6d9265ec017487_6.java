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
			StringBuffer encoded = new StringBuffer();
		for(char c : s.toCharArray()){
			if(c == '{' || c == '}'){
				try{
					encoded.append(URLEncoder.encode(""+c, "UTF-8"));
				}catch(UnsupportedEncodingException e){
					//ignore and append original character
					encoded.append(c);
				}
			}else{
				encoded.append(c);
			}
		}
		return encoded.toString();
	}

	/** 
	 * Decodes a string with template parameters names, specifically the characters '{' and '}' are expected to be percent-encoded.
	 * @param s the string with zero or more template parameters names, percent-encoded if needed
	 * @return the string with decoded template parameters names.
	 */
	
	public static String decodeTemplateNames(String s){
		try{
			return URLDecoder.decode(s, "UTF-8");
		}catch(UnsupportedEncodingException e){
			//ignore and return original value
			return s;
		}
	}
}