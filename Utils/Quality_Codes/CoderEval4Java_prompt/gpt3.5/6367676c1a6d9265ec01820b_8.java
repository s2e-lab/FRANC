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
			String result = inString;
		for (int i = 0; i < charsToDelete.length(); i++) {
			result = result.replaceAll(Character.toString(charsToDelete.charAt(i)), "");
		}
		return result;
	}
}