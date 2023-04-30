import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Interpret a character as a digit (in any base up to 36) and return the numeric value. This is like {@code Character.digit()} but we don't accept non-ASCII digits.
	 */
	
	private static int digitValue(final char c){
			if(Character.isDigit(c)){
				return Character.digit(c, 10);
			}
			else if(c >= 'a' && c <= 'z'){
				return 10 + (c - 'a');
			}
			else if(c >= 'A' && c <= 'Z'){
				return 10 + (c - 'A');
			}
			else{
				throw new IllegalArgumentException("Not a digit: " + c);
			}
	}
	
	/**
	 * Convert a positive integer to a string representing it in the given base. The base must be at most 36.
	 */
	
	public static String intToString(final int number, final int base){
			if(base < 2 || base > 36){
				throw new IllegalArgumentException("Invalid base: " + base);
			}
			if(number == 0){
				return "0";
			}
			final StringBuilder sb = new StringBuilder();
			int remaining = number;
			while (remaining > 0){
				final int digit = remaining % base;
				final char c = digit < 10 ? (char)('0' + digit) : (char)('a' + digit - 10) ;
				sb.append(c);
				remaining /= base;
			}
			return sb.reverse().toString();
	}
	
	/**
	 * Convert the textual representation of a number in the given base to its numeric value.
	 */
	
	public static int stringToInt(final String s, final int base){
			if(base < 2 || base > 36){
				throw new IllegalArgumentException("Invalid base: " + base);
			}
			if(s.isEmpty()){
				throw new IllegalArgumentException("Empty string");
			}
			int i = 0;
			if(s.charAt(0) == '-'){
				throw new IllegalArgumentException("Negative numbers not supported");
			}
			int result = 0;
			final int len = s.length();
			while(i < len){
				final char c = s.charAt(i);
				final int digit = digitValue(c);
				if(digit >= base){
					throw new IllegalArgumentException("Invalid digit for base " + base + ": " + c);
				}
				result = result * base + digit;
				i++;
			}
			return result;
	}
	
	/**
	 * Convert a floating point number in the format "[-]dddd(.dddd)([eE][-+]ddd)" to its numeric value.
	 */
	
}