import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParsedSql{
	/** 
	 * Determine whether a parameter name ends at the current position, that is, whether the given character qualifies as a separator. 
	 */
	
	private static boolean isParameterSeparator(final char c){
		return 		c=='%' ||
				c=='?' ||
				c=='*' ||
				c=='+' ||
				c==',' ||
				c=='-' ||
				c=='=';
	}
	/** 
	 * Determine whether the given token (possibly of multiple tokens) is a separator that ends at the current position. 
	 */
	private static boolean isSeparator(final Token token){
		Token token2 = token.getNext();
}
}