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
			StringBuffer b=new StringBuffer(s.length()+2);
			for(int i=0; i<s.length(); i++){
					int c=Utility.urlEncodeWithPlus(s.charAt(i),1);
					b.append("%00-");
					b.append(Character.forDigit((c & 0xFF)))
						.append("%00");
			}
			return b.toString();
	}
	/** Encodes an object to either an URI or a byte array. */
}