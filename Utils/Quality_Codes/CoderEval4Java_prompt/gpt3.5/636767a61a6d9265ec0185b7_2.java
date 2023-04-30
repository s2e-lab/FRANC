import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Interpret a character as a digit (in any base up to 36) and return the numeric value. This is like {@code Character.digit()} but we don't accept non-ASCII digits.
	 */
	
	private static int digitValue(final char c){
			if ((c >= '0') && (c <= '9')) {
			return c - '0';
		} else if ((c >= 'a') && (c <= 'z')) {
			return c - 'a' + 10;
		} else if ((c >= 'A') && (c <= 'Z')) {
			return c - 'A' + 10;
		} else {
			throw new IllegalArgumentException("Invalid digit: " + c);
		}
	}
	
	/**
	 * Pad a string to a certain width by inserting spaces at the beginning.
	 * If the string is already wider than the specified width, return it unchanged.
	 */
	public static String padLeft(final String s, final int width) {
		if (s.length() >= width) {
			return s;
		} else {
			char[] blanks = new char[width - s.length()];
			Arrays.fill(blanks, ' ');
			return new String(blanks) + s;
		}
	}
	
	/**
	 * Pad a string to a certain width by appending spaces to the end.
	 * If the string is already wider than the specified width, return it unchanged.
	 */
	public static String padRight(final String s, final int width) {
		if (s.length() >= width) {
			return s;
		} else {
			char[] blanks = new char[width - s.length()];
			Arrays.fill(blanks, ' ');
			return s + new String(blanks);
		}
	}
	
	/**
	 * Parse a floating-point number according to the grammar:
	 *   FLOAT ::= [SIGN] (NUM DOT [NUM] | DOT NUM) [EXP [SIGN] NUM]
	 * where SIGN is one of '+' or '-', NUM is a non-empty sequence of decimal digits, DOT is the decimal point,
	 * and EXP is the letter 'E' or 'e' and an optionally signed non-empty sequence of decimal digits.
	 * This code assumes that the input string has already been trimmed.
	 * If the string does not match this grammar, or if the resulting value overflows or underflows a double,
	 * this method throws NumberFormatException.
	 */
	public static double parseFloat(final String s) throws NumberFormatException {
		final int N = s.length();
		int i = 0;
		
		// parse optional sign
		boolean negative = false;
}
}