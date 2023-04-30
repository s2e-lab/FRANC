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
		 String ret = null;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '}'){
				if (count == 0)
					ret += s.charAt(i) + "%";
				else
					ret += s.charAt(i) + "%," + (count++);
			}
		}
		return ret;
	}
	
}