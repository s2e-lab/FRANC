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
			// code to match URI against pattern
			// you can use regex or string functions to match the URI against the pattern
			// return the match result or null if no match occurs
			return null; // replace with your code
	}
	
	/**
	 * Main method to test the UriPattern class.
	 */
	public static void main(String[] args) {
		UriPattern pattern = new UriPattern();
		String uri = "https://www.example.com/path/file.html";
		MatchResult result = pattern.match(uri);
		if(result != null){
			System.out.println("Match found!");
			// print the match groups if needed
		}else{
			System.out.println("No match found!");
		}
		
	}
}

interface MatchResult{
	// interface to define the match result object if needed
}