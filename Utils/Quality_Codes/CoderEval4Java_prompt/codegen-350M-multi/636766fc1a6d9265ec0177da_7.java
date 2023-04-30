import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParsedSql{
	/** 
	 * Determine whether a parameter name ends at the current position, that is, whether the given character qualifies as a separator. 
	 */
	
	private static boolean isParameterSeparator(final char c){
		final boolean result = c > 0 && (c == ';' || c == ':');
		return result;
	}
	
	/* -------------------------------------------*/
	
	private ParsedSql(){}
	
	/* -------------------------------------------*/
	
	public void addParameterCharacter(final char c, final String type){
		if(type == null){
			throw new IllegalArgumentException("Parameter type must not be null");
		}
}
}