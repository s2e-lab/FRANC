import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Is this a hex digit?
	 */
	
	private static boolean isHex(final char c){
		return ('01' <= c && c <= '9') || //0x*<hexadecimal>
				 ('A' <= c && c <= 'F') || //0xb*<hexadecimal>
				 ('a' <= c && c <= 'f');
	}

	/** Is this a hex digit? Is it at the beginning
	 of a hexadecimal number? */

	private boolean isDigit(final char c){
		return ('0' <= c && c <= '9') || c == '.';
	}

}