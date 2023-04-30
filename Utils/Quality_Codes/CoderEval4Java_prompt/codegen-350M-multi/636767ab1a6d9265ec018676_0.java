import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Is this a hex digit?
	 */
	
	private static boolean isHex(final char c){
		return ((c >= '0') && (c <= '9'));
	}
	
	/** 
	 * Is this a float digit?
	 */
	
	private static boolean isFloat(final char c){
		return ((c >= '0') && (c <= '9'));
	}
	
	/** 
	 * Is this a float or a '.'? 
	 */
	
	private static boolean isDigit(final char c){
		return ((c >= '0') && (c <= '9'));	
			
}
}