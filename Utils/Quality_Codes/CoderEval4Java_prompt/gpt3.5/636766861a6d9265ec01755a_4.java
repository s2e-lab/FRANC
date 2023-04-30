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
			// Initialize variables
		MatchResult result = null;
		Pattern pattern = Pattern.compile("your_pattern_here");
		Matcher matcher = pattern.matcher(uri);
		
		// Check for match
		if(matcher.matches()){
			
			// Create MatchResult object and set groups
			result = new MatchResult();
			result.setGroup("group1", matcher.group(1));
			result.setGroup("group2", matcher.group(2));
			// add more groups if necessary
			
		}
		
		return result;
	}
}
