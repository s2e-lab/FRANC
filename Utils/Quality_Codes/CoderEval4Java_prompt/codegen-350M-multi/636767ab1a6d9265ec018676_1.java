import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Is this a hex digit?
	 */
	
	private static boolean isHex(final char c){
		
		if(c == '/' || c=='\\')
			return false;
		return ('0' <= c && c <= '9') ||
			('A' <= c && c <= 'F') ||
			('a' <= c && c <= 'f');
	}

	/** 
	 * Is this a decimal digit?
	 */
	
	private static boolean isDecimal(final char c){
		
		return ('0' <= c && c <= '9');
	}
	
}