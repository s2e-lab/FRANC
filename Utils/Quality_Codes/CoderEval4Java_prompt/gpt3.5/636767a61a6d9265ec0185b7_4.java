import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Interpret a character as a digit (in any base up to 36) and return the numeric value. This is like {@code Character.digit()} but we don't accept non-ASCII digits.
	 */
	
	private static int digitValue(final char c){
			if (c >= '0' && c <= '9'){
			return c - '0';
		}
		else if (c >= 'a' && c <= 'z'){
			return c - 'a' + 10;
		}
		else if (c >= 'A' && c <= 'Z'){
			return c - 'A' + 10;
		}
		else{
			throw new IllegalArgumentException("Invalid digit: "+c);
		}
	}
	
	/**
	 * Interpret a string as an integer in the given base, returning the result as a BigInteger.
	 */
	public static BigInteger parseBigInteger(final String s, final int base){
		BigInteger result = BigInteger.ZERO;
		final int len = s.length();
		for (int i=0; i<len; i++){
			final char c = s.charAt(i);
			final int digit = digitValue(c);
			if (digit >= base){
				throw new IllegalArgumentException("Invalid digit in input: "+c);
			}
			result = result.multiply(BigInteger.valueOf(base)).add(BigInteger.valueOf(digit));
		}
		return result;
	}
	
	/**
	 * Interpret a string as an integer in base 10, returning the result as a BigInteger.
	 */
	public static BigInteger parseBigInteger(final String s){
		return parseBigInteger(s, 10);
	}
}