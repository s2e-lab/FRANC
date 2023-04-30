import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Is this a hex digit?
	 */
	
	private static boolean isHex(final char c){
		return ((c >= 'a' && c <= 'f' ||
				c >= 'A' && c <= 'F' ||
				c >= '0' && c <= '7' ||
				c == 'F');
		}
}
