import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Interpret a character as a digit (in any base up to 36) and return the numeric value. This is like {@code Character.digit()} but we don't accept non-ASCII digits.
	 */
	
	private static int digitValue(final char c){
			if(c >= '0' && c <= '9'){
			return c - '0';
		} else if(c >= 'A' && c <= 'Z'){
			return c - 'A' + 10;
		} else if(c >= 'a' && c <= 'z'){
			return c - 'a' + 10;
		} else {
			throw new IllegalArgumentException("Invalid digit: " + c);
		}
	}
	
	/**
	 * Parse a long integer from a string in any convenient format.
	 * The string may start with "-" to indicate a negative number.
	 * The number may have a suffix with a base indicator, e.g. "1234h" means base 18
	 */
	public static long parseLong(final String s){
		int pos = 0, len = s.length(), radix = 10;
		if(len == 0){
			throw new NumberFormatException("empty string");
		}
		boolean negative = false;
		if(s.charAt(0) == '-'){
			negative = true;
			++pos;
			if(pos == len){
				throw new NumberFormatException("Just a dash, no number: " + s);
			}
		}
		char c = s.charAt(pos);
		if(c == '0' && pos < len - 1){
			c = s.charAt(++pos);
			if(c == 'x' || c == 'X'){  // hex
				radix = 16;
				++pos;
			} else if(c == 'b' || c == 'B'){  // binary
				radix = 2;
				++pos;
			} else if(c >= '0' && c <= '7'){  // octal
				radix = 8;
			} else if(c >= '1' && c <= '9'){  // decimal
				radix = 10;
			} else {  // just a zero
				return 0;
			}
		}
}
}