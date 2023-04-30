import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParsedSql{
	/** 
	 * Determine whether a parameter name ends at the current position, that is, whether the given character qualifies as a separator. 
	 */
	
	private static boolean isParameterSeparator(final char c){
		
		
		if(Character.isJavaIdentifierStart(c)){
			return true;
			//return (Character.isJavaIdentifierPart(c) &&!Character.isJavaIdentifierPart(c - 1));
		}else if(c == '`'){
			return true; 
		}
		
		
		return false;
	}
	public boolean check() throws Exception{
		
		
		//printout("\n" + sql);
		
}
}