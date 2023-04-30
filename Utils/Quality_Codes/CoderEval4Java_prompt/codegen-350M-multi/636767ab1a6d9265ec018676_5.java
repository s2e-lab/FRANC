import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Is this a hex digit?
	 */
	
	private static boolean isHex(final char c){
		return (('0' <= c) && (c <= '9')) || ('a' <= c) || ('b' <= c) || ('c' <= c) || ('d' <= c) || ('e' <= c) || ('f' <= c);
	}
	
	/** 
	 * Is this a whitespace segment? 
	 */
	private static boolean isWhitespace(final char c){
		return ((''<= c) || ('\t' <= c));
	}
	
}