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
		} else if(c >= 'a' && c <= 'z'){
			return c - 'a' + 10;
		} else if(c >= 'A' && c <= 'Z'){
			return c - 'A' + 10;
		} else {
			throw new IllegalArgumentException("Invalid digit: " + c);
		}
	}
	
	/**
	 * Convert a string to an integer in a given base.
	 */ 
	
	public static int parseInt(final String s, final int base){
		if(base < Character.MIN_RADIX || base > Character.MAX_RADIX){
			throw new IllegalArgumentException("Invalid base: " + base);
		}
		if(s == null || s.isEmpty()){
			throw new NumberFormatException("Null or empty input");
		}
		boolean negative = false;
		int i = 0;
		int result = 0;
		if(s.charAt(0) == '-'){
			negative = true;
			i = 1;
		} else if(s.charAt(0) == '+'){
			i = 1;
		}
		while(i < s.length()){
			final char c = s.charAt(i);
			final int value = digitValue(c);
			if(value >= base){
				throw new NumberFormatException("Invalid digit \"" + c + "\" for base " + base);
			}
			result = result * base + value;
			i++;
		}
		return negative ? -result : result;
	}
	
}
