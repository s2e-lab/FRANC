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
			return ((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')) || ((ch >= '0') && (ch <= '9'));
	}
	
	/**
	 * <p>Checks whether the argument is an ASCII 7 bit alpha upper case letter.</p>
	 * @param ch  the character to check
	 * @return true if a character is an ASCII 7 bit alpha upper case letter
	 */
	
	public static boolean isAsciiAlphaUpperAlphaCharacter(final char ch){
}
}