import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Interpret a character as a digit (in any base up to 36) and return the numeric value. This is like {@code Character.digit()} but we don't accept non-ASCII digits.
	 */
	
	private static int digitValue(final char c){
			if(Character.isDigit(c))
			return Character.digit(c, 10); // base 10
		else if(Character.isLowerCase(c))
			return c - 'a' + 10;
		else if(Character.isUpperCase(c))
			return c - 'A' + 10;
		else
			throw new IllegalArgumentException(String.format("Invalid digit: %c", c));
	}

	/**
	 * Parse a string representation of an integer in the given base.
	 * Returns {@link BigInteger} since we don't want to lose precision.
	 */
	public static BigInteger parseInteger(final String text, final int base){
		final BigInteger b = BigInteger.valueOf(base);
		BigInteger result = BigInteger.ZERO;
		boolean negative = false;
		
		for(int i = 0; i < text.length(); ++i){
			final char c = text.charAt(i);
			if(c == '-')
				negative = true;
			else if(c == '+')
				negative = false;
			else{
				final int digit = digitValue(c);
				result = result.multiply(b).add(BigInteger.valueOf(digit));
			}
		}
		
		return negative ? result.negate() : result;
	}

	/**
	 * Format an integer in the given base.
	 */
	public static String formatInteger(final BigInteger integer, final int base){
		if(integer.signum() == -1)
			return "-" + formatInteger(integer.negate(), base);
		
		final StringBuilder sb = new StringBuilder();
		final BigInteger b = BigInteger.valueOf(base);
		BigInteger remaining = integer;
		
		while(!remaining.equals(BigInteger.ZERO)){
			final BigInteger[] divmod = remaining.divideAndRemainder(b);
			final int digit = divmod[1].intValue();
			
			if(digit < 10)
				sb.append((char)('0' + digit));
			else
				sb.append((char)('a' + digit - 10));
			
			remaining = divmod[0];
		}
		
		if(sb.length() == 0)
			return "0";
		
		return sb.reverse().toString();
	}
}