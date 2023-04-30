import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParsedSql{
	/** 
	 * Determine whether a parameter name ends at the current position, that is, whether the given character qualifies as a separator. 
	 */
	
	private static boolean isParameterSeparator(final char c){
		// Note the two "else" lines are to ensure that if the characters are not part of 
		// the set of accepted identifiers, then the parameter name can be made lowercase. 
		boolean isParameterIdentifier = Character.isIdentifierStart(c);
			
	        return ((c == '"') || ((c == ',') && isParameterIdentifier));
	}

	
	public void toStatementParameters(final java.math.BigDecimal i, final Collection<String> names){

		StringBuilder currentParameter = new StringBuilder();
}
}