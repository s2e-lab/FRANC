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
		for(int i=inString.length()-1;i > -1;i--)
			if(charsToDelete.indexOf(inString.charAt(i))!= -1)
				inString = inString.substring(0, i) + inString.substring(i+1);
		return inString;
	}
	
}