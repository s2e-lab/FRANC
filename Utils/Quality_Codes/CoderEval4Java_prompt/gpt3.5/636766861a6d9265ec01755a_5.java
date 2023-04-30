import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class UriPattern{
	/** 
	 * Match a URI against the pattern.
	 * @param uri the uri to match against the template.
	 * @return the match result, otherwise null if no match occurs.
	 */
	
	public final MatchResult match(CharSequence uri){
			// TODO: Implement the match function
	}
	
	
	/** 
	 * Validate if a given string is a valid URI.
	 * @param uri the string to validate as URI.
	 * @return true if the string is a valid URI, otherwise false.
	 */
	
	public static boolean validate(String uri) {
		// Use Java's built-in URI class to validate the URI
		try {
			new URI(uri);
			return true;
		} catch (URISyntaxException e) {
			return false;
		}
	}
	
	
	/**
	 * Main function to test the UriPattern class.
	 */
	
	public static void main(String[] args) {
		// TODO: Add test cases
		
	}
}