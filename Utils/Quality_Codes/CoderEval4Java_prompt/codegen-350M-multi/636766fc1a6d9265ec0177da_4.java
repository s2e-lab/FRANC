import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParsedSql{
	/** 
	 * Determine whether a parameter name ends at the current position, that is, whether the given character qualifies as a separator. 
	 */
	
	private static boolean isParameterSeparator(final char c){
		return c==':' || c==';' || c==''|| c=='\'';
	}
	
	private static final String ELLIPSIS = "...";
	private ParsedSql(int start, int end, ParseStateFactory factory) throws QueryException{
		int prevPos = start;
		int i=0;
		boolean foundSeparator = false;
}
}