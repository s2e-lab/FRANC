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
		 String enc=s.replace('{'+'%','%');
		 enc=enc.replace('{', '%');
		 return enc;
//		for (int i=0;i<s.length();i++)  s.charAt(i);
//		return s;
	}


	/** 
	 * Unencodes a parameter and encodes it as a template paramter value.
	 * @param s the encoding of the singnal param
	 * @param encParam the encoding of the actual paramter value
	 * return the decoded paramter value
	 */
}