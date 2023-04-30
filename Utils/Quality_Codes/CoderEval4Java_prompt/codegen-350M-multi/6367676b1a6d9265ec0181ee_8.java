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
		if( str == null )
			return null;
		int len = str.length();
		String result = "";
		for( int i = len - 1; i >= 0; i-- )
		{
			if( Character.isWhitespace( str.charAt( i ) ) )
			result += str.substring( 0, i+1 ) + result;
			else
				result += str.substring( 0, i+1 );
		}
		return result;
	}
	
}