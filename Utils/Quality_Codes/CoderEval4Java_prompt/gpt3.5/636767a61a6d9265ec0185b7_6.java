import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Interpret a character as a digit (in any base up to 36) and return the numeric value. This is like {@code Character.digit()} but we don't accept non-ASCII digits.
	 */
	
	private static int digitValue(final char c){
			if (c >= '0' && c <= '9') { // if digit is between 0-9
			return c - '0';
		} else if (c >= 'a' && c <= 'z') { // if digit is between a-z
			return c - 'a' + 10;
		} else {
			throw new IllegalArgumentException("Invalid digit: " + c);
		}
	}

	/**
	 * Format an integer in a given base, using the digits 0-9 and a-z (for bases greater than 10). Negative values are always shown with a leading '-'.
	 * 
	 * @param n the number to be formatted
	 * @param base the base to format it in (up to 36)
	 * 
	 * @return the formatted string
	 */
	public static String formatInt(int n, int base) {
		if (base < Character.MIN_RADIX || base > Character.MAX_RADIX) {
			throw new IllegalArgumentException("Invalid base: " + base);
		}
		StringBuilder sb = new StringBuilder();
		if (n < 0) {
			sb.append("-");
			n = -n;
		}
		do {
			char digit = Character.forDigit(n % base, base);
			sb.append(Character.toUpperCase(digit));
			n /= base;
		} while (n != 0);
		return sb.reverse().toString();
	}

	/**
	 * Parse an integer from a string in a given base, using the digits 0-9 and a-z (for bases greater than 10).
	 * 
	 * @param s the string to be parsed
	 * @param base the base to assume for the input (up to 36)
	 * 
	 * @return the integer value
	 * 
	 * @throws IllegalArgumentException if the input can't be parsed as a valid, signed integer in the given base
	 */
	public static int parseInt(String s, int base) {
		if (s.isEmpty()) {
			throw new IllegalArgumentException("Empty string");
		}
		if (base < Character.MIN_RADIX || base > Character.MAX_RADIX) {
			throw new IllegalArgumentException("Invalid base: " + base);
		}
		int result = 0;
		boolean negative = (s.charAt(0) == '-');
}
}