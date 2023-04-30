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
			//TODO: Implement the match method
	}
	
	/**
	 * Returns the regular expression string used to build this UriPattern.
	 * @return the regular expression string representing this UriPattern.
	 */
	public final String getPattern(){
		//TODO: Implement the getPattern method
	}
	
	/**
	 * Determines whether this UriPattern is equal to another object.
	 * @param other the object to compare this UriPattern against.
	 * @return true if this UriPattern is equal to the other object, false otherwise.
	 */
	@Override
	public boolean equals(Object other){
		//TODO: Implement the equals method
	}
	
	/**
	 * Computes the hash code of this UriPattern.
	 * @return the computed hash code.
	 */
	@Override
	public int hashCode(){
		//TODO: Implement the hashCode method
	}
}

/**
 * Represents the result of matching a URI against a UriPattern.
 */
interface MatchResult{
	/**
	 * Gets the value of the specified captured group in the match.
	 * @param group the index of the group to retrieve.
	 * @return the value of the captured group.
	 */
	public String group(int group);
	
	/**
	 * Gets the number of captured groups in the match.
	 * @return the number of captured groups in the match.
	 */
	public int groupCount();
}