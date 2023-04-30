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
			else if(Character.isLowerCase(c)){
				return c - 'a' + 10;
			}
			else if(Character.isUpperCase(c)){
				return c - 'A' + 10;
			}
			else{
				throw new IllegalArgumentException(String.format("'%c' is not a valid digit", c));
			}
	}
	
	/** 
	 * Parse a BigInteger from a string in any base from 2 to 36. 
	 */
	
	public static BigInteger parseBigInteger(final String text, final int radix){
		final int length = text.length();
		BigInteger result = BigInteger.ZERO;
		// Read all digits from most to least significant
		for(int i=0; i < length; i++){
			final char digitChar = text.charAt(i);
			final int digitValue = digitValue(digitChar);
			// Multiply the existing result by the input radix, then add the current digit
			result = result.multiply(BigInteger.valueOf(radix)).add(BigInteger.valueOf(digitValue));
		}
		return result;
	}
	
	/** 
	 * Format a BigInteger as a string in any base from 2 to 36. 
	 */
	
	public static String formatBigInteger(final BigInteger number, final int radix){
		final String digitChars = "0123456789abcdefghijklmnopqrstuvwxyz";
		final StringBuilder builder = new StringBuilder();
		BigInteger remaining = number.abs();
		// Generate all digits from most to least significant - note we need to output at least one digit (0 if the input number is 0)
		do{
			final BigInteger[] quotientAndRemainder = remaining.divideAndRemainder(BigInteger.valueOf(radix));
			final BigInteger quotient = quotientAndRemainder[0];
			final BigInteger remainder = quotientAndRemainder[1];
			final char digitChar = digitChars.charAt(remainder.intValue());
			// Prepend the most recently computed digit to the accumulated result (since we need to output digits from most to least significant)
			builder.insert(0, digitChar);
			remaining = quotient;
		}while(!remaining.equals(BigInteger.ZERO));
		if(number.signum() == -1){
			builder.insert(0, '-');
		}
		return builder.toString();
	}
	
	// Example usage
	public static void main(String[] args){
		final BigInteger number = BigInteger.valueOf(1234567890);
}
}