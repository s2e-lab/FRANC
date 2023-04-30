import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParameterParser{
	/** 
	 * Parses out a token until any of the given terminators is encountered.
	 * @param terminators the array of terminating characters. Any of these characters when encountered signify the end of the token
	 * @return the token
	 */
	
	private String parseToken(final char[] terminators){
			Scanner scanner = new Scanner(System.in);
			StringBuilder sb = new StringBuilder();
			while (scanner.hasNext()) {
			    char c = scanner.next().charAt(0);
			    boolean found = false;
			    for (char terminator : terminators) {
			        if (c == terminator) {
			            found = true;
			            break;
			        }
			    }
			    if (found) {
			        break;
			    } else {
			        sb.append(c);
			    }
			}
			return sb.toString();
		}
}

/**
 * Sample usage of the ParameterParser class
 */