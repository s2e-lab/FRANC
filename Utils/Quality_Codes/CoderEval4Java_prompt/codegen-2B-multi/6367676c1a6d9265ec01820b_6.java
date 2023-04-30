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
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<inString.length();i++){
			char c = inString.charAt(i);
			if(charsToDelete.indexOf(c) == -1)
				sb.append(c);
		}
		return sb.toString();
	}
}
