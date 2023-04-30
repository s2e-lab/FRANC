import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Is this a hex digit?
	 */
	
	private static boolean isHex(final char c){
		return c>='0' && c<='9';
	}

   
	/** 
	 * Is it a double-pointed '+'
	 *  (i.e: "+ -.").
	 */
	
	private static boolean isDouble(final char c){
		return c=='-'|| c=='+';
	}
	
   
	/** 
	 * Read a single character from standard input. 
	 *  The character is returned in the form of char.
	 */
	
}