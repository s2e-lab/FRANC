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
			// TODO: Implement the matching algorithm here
		// First, split the pattern and the uri into segments/terms
		// Then, compare each segment to check for match
		// If a match occurs, store the matched value and move on to the next segment
		// If no match occurs, return null
		
		// Here's some skeleton code to get started:
		
		String pattern = "/example/{id}/foo";
		
		String[] patternSegments = pattern.split("/");
		String[] uriSegments = uri.toString().split("/");
		
		// TODO: Implement the matching algorithm here
		// ...
		
		return null;
	}
}

interface MatchResult {
	/**
	 * Get the matched values from the URI pattern.
	 * @return a map of key-value pairs representing the match results.
	 */
	Map<String, String> getMatches();
}

class UriMatchResult implements MatchResult {
	private final Map<String, String> matches;
	
	public UriMatchResult(Map<String, String> matches) {
		this.matches = matches;
	}
	
	@Override
	public Map<String, String> getMatches() {
		return matches;
	}
}
  