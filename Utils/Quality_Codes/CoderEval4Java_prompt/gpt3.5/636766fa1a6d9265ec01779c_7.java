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
			Scanner sc = new Scanner(System.in);
StringBuilder sb = new StringBuilder();
char c;

while (sc.hasNext()) {
	c = sc.next().charAt(0);
	if (containsChar(terminators,c)) {
		break;
	}
	sb.append(c);
}

return sb.toString();
}

/** 
 * Helper method to check if a character is contained in an array.
 * @param arr the array to search
 * @param target the character to search for
 * @return true if the character is found in the array, false otherwise
 */
private boolean containsChar(final char[] arr, final char target) {
    for (char c : arr) {
        if (c == target) {
            return true;
        }
    }
    return false;
}
}
