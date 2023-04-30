import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Is this a hex digit?
	 */
	
	private static boolean isHex(final char c){
		return (c == 'x' || c == 'X');	
	}	

	/** 
	 * Is this a three digit hexadecimal number?
	 */
	
	private static boolean is3Digits(final char c){
		return (c >= '0' && c <= '9');
	}	

	/** 
	 * Return the amount of padding that will be added before any of the
	 * specified text characters.
	 */
	
	private static int calcNumPadding(final char c){
}
}