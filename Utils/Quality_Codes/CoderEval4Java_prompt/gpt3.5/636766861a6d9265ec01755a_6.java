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
			// TODO: Implement the method to match URI against the template
			return null;
	}
	
	/**
	 * Define a URI pattern.
	 * @param template the pattern to use. 
	 */
	public UriPattern(String template){
		// TODO: Implement the constructor to accept and store the template
	}
	
	/**
	 * Interface for the match result.
	 */
	public interface MatchResult{
		// TODO: Define the interface for the match result
	}
	
	/**
	 * Implementation of the match result interface.
	 */
	private static class MatchResultImpl implements MatchResult{
		// TODO: Implement the match result interface
	}
	
	/**
	 * Main method to test the UriPattern class.
	 */
	public static void main(String[] args){
		// TODO: Implement the main method to test the UriPattern class
	}
}