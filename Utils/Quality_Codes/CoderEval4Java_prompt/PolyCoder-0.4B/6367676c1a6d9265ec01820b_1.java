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
			if(inString==null){throw new IllegalArgumentException("argument cannot be null");}
			int  first = 0;
			int  last = inString.length();
			
			for(;first<last;first++){
				if(inString.charAt(first)==charsToDelete.charAt(0)){
					inString = inString.substring(first,first+1);	
					break;
				}
			}
			
			return inString;
		}
	
}