import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DOTEventDrivenImporter{
	/** 
	 * Unescape a string DOT identifier.
	 * @param input the input
	 * @return the unescaped output
	 */
	
	private String unescapeId(String input){
		
		// the input is the escaped ID
		String output = input.toLowerCase();
		output = output.replaceAll("(;|@)", "_");
		return output;
	}
	
	/** 
	 * Parse the.dot file and create a Set of all events in the DOT file, from the text input.
	 * @param text input from which the.dot files are parsed
	 * @return a Set of events and all associated data used as input parameters
	 * @throws IOException if the input cannot be written to a file
	 */
}