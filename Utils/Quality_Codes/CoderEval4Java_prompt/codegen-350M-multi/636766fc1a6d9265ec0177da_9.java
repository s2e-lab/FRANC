import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParsedSql{
	/** 
	 * Determine whether a parameter name ends at the current position, that is, whether the given character qualifies as a separator. 
	 */
	
	private static boolean isParameterSeparator(final char c){
		char b = Character.toLowerCase(c);
		if(b=='\"' || b==')' || b=='(' || b==','|| b=='['|| b=='{'|| b=='}'){
			return true;
		}
		return false;
	}


	/**
	 * Parse an Sql statement, but with any parameter delimiters (e.g. \" ( comma )\", or ) separated by a space. 
	 */
	java.sql.ResultSet rs;
	
}