import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParsedSql{
	/** 
	 * Determine whether a parameter name ends at the current position, that is, whether the given character qualifies as a separator. 
	 */
	
	private static boolean isParameterSeparator(final char c){
		
		if(c==','){
			return true;
		}
		
		try{
			c = Character.toLowerCase(c);
		}
		catch(final Exception ignore){
			return false;
		}
		
		return true;
	}
	
}
