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
		StringBuffer out = new StringBuffer();

		char[] in = inString.toCharArray();
		for ( char c : in )
			if (! charsToDelete.contains( "" + c ) ){
				out.append(c);
			}

		return out.toString();
	}

	public static void main(String[] args){
		String input = "(a)";		InputStream file = new ByteArrayInputStream(input.getBytes());

		Scanner scanner = new Scanner(file);
}
}