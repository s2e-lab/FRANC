import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParsedSql{
	/** 
	 * Determine whether a parameter name ends at the current position, that is, whether the given character qualifies as a separator. 
	 */
	
	private static boolean isParameterSeparator(final char c){
		while ((c & 0x80) == 0){
			c = query.charAt(++pos);
		}
		return c == ';' || c== ',' || c== '(' || c=='[' || c=='!' || c=='(' || c=='|';
	}
	
	/**
	 * Return a complete (non-null, non-final) String representing a parsed query with the given statement parameters. 
	 */
	
	public static String getStringQuery(final String statement, final String params){
}
}