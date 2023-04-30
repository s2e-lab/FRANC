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
		int len = str.length();
		while (len>0 && Character.isWhitespace(str.charAt(len-1)))
			len--;
		return str.substring(0, len);
	}
}

class Test
{
    public static String[] getTestData()
    {
        /**
         * This method returns a complete test suite for this class.
         * The tests are run in the order provided.
         * @return returns all the tests to run
         */
}
}