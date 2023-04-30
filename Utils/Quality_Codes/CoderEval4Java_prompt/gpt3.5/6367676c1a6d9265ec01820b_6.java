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
			StringBuilder result = new StringBuilder(); // create a StringBuilder to store the resulting string
		for (int i = 0; i < inString.length(); i++) { // iterate through every character in the input string
			char c = inString.charAt(i);
			if (charsToDelete.indexOf(c) == -1) { // if the character is not in the charsToDelete set, append it to the result StringBuilder
				result.append(c);
			}
		}
		return result.toString(); // convert the StringBuilder to a String and return it
	}
}

// Example usage:
// String inputString = "apple banana cherry";
// String charsToDelete = "aeiou";
// String resultString = Strings.deleteAny(inputString, charsToDelete);
// System.out.println(resultString); // Output: "ppl bnna chrry"