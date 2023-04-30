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
			StringBuilder result = new StringBuilder(); // create a StringBuilder object to build the resulting String
		for (int i = 0; i < inString.length(); i++) {
			char c = inString.charAt(i);
			if (charsToDelete.indexOf(c) == -1) { // if the current character is not in charsToDelete
				result.append(c); // append the current character to result
			}
		}
		return result.toString(); // convert the StringBuilder to a String and return it
	}
}