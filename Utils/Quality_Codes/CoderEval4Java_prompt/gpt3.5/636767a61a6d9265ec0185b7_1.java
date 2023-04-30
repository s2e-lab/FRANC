import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Interpret a character as a digit (in any base up to 36) and return the numeric value. This is like {@code Character.digit()} but we don't accept non-ASCII digits.
	 */
	
	private static int digitValue(final char c){
			// Check if the character is a digit (0-9)
	if (c >= '0' && c <= '9') {
		return c - '0';
	}
	
	// Check if the character is an uppercase letter (A-Z)
	if (c >= 'A' && c <= 'Z') {
		return c - 'A' + 10;
	}
	
	// Check if the character is a lowercase letter (a-z)
	if (c >= 'a' && c <= 'z') {
		return c - 'a' + 10;
	}
	
	// If character is not a digit or valid letter, return -1 to indicate error
	return -1;
}

/**
 * Convert a string representation of a number in any base up to 36 to an integer value.
 */
public static int parseNumber(final String number, final int base){
	int result = 0;
	
	// Iterate through each character in the string
	for (char c : number.toCharArray()) {
		int digit = digitValue(c);
		
		// Check if the character is a valid digit in the specified base
		if (digit < 0 || digit >= base) {
			throw new IllegalArgumentException("Invalid digit: " + c);
		}
		
		// Update the result with the new digit
		result = result * base + digit;
	}
	
	return result;
}

/**
 * Convert an integer to a string representation in any base up to 36.
 */
public static String formatNumber(int number, final int base){
	if (number == 0) {
		return "0";
	}
	
	StringBuilder result = new StringBuilder();
	
	while (number > 0) {
		// Determine the digit in the current base and append it to the result string
		int digit = number % base;
		if (digit < 10) {
			result.append((char)('0' + digit));
		} else {
			result.append((char)('A' + digit - 10));
		}
		
		// Move on to the next digit
		number /= base;
	}
	
	// Reverse the result string and return it
	return result.reverse().toString();
}
}