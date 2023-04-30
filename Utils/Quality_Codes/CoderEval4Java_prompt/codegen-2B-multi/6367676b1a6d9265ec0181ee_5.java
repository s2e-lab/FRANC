import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Trim trailing whitespace from the given String.
	 * @param str the String to check
	 * @return the trimmed String
	 * @see java.lang.Character#isWhitespace
	 */
	
	public static String trimTrailingWhitespace(String str){
		return str.trim().replaceAll("\\s+", " ");
	}
	
	// IO Boilerplate
	
	public static BigInteger parseBigInteger(String str) throws NumberFormatException
	{
    	str = str.trim();
    	if (str.length() > 0 &&!str.startsWith("0")) 
    	{
        	return new BigInteger(str);
    	}

    	return BigInteger.ZERO;
	}
	
}