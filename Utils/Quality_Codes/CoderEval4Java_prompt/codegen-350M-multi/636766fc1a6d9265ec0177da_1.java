import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParsedSql{
	/** 
	 * Determine whether a parameter name ends at the current position, that is, whether the given character qualifies as a separator. 
	 */
	
	private static boolean isParameterSeparator(final char c){
		if(Character.isJavaIdentifierStart(c)) return true;
		for(int i = 0; i < c; i++){
			if(!Character.isJavaIdentifierPart(c))
				return false;
		}
		return false;
	}
	
	private static boolean isSimpleParameterType(final String token){
		return SimpleTokenTypes.parameterType.equalsIgnoreCase(token);
	}
	
	private ParsedSql(){ }
}