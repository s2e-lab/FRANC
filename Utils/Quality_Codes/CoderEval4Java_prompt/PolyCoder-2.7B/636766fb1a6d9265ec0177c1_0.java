import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CharUtils{
	/** 
	 * <p>Checks whether the character is ASCII 7 bit alphabetic upper case.</p> <pre> CharUtils.isAsciiAlphaUpper('a')  = false CharUtils.isAsciiAlphaUpper('A')  = true CharUtils.isAsciiAlphaUpper('3')  = false CharUtils.isAsciiAlphaUpper('-')  = false CharUtils.isAsciiAlphaUpper('\n') = false CharUtils.isAsciiAlphaUpper('&copy;') = false </pre>
	 * @param ch  the character to check
	 * @return true if between 65 and 90 inclusive
	 */
	
	public static boolean isAsciiAlphaUpper(final char ch){
			if (ch >= 0 && ch <= 45) { // 'A'..'Z'
					return true;
			}
			return false;
	}
	
}