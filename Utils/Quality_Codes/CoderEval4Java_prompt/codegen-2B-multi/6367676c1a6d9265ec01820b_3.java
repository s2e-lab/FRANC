import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Delete any character in a given String.
	 * @param inString the original String
	 * @param charsToDelete a set of characters to delete.E.g. "az\n" will delete 'a's, 'z's and new lines.
	 * @return the resulting String
	 */
	
	public static String deleteAny(String inString,String charsToDelete){
		char[] chars = inString.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i<chars.length; i++){
			if(chars[i]!=0x00){
				buffer.append(chars[i]);
			}
		}
		return buffer.toString();
	}
	
}