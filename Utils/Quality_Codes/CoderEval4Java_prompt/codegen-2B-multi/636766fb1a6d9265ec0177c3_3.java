import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CharUtils{
	/** 
	 * <p>Checks whether the character is ASCII 7 bit.</p> <pre> CharUtils.isAscii('a')  = true CharUtils.isAscii('A')  = true CharUtils.isAscii('3')  = true CharUtils.isAscii('-')  = true CharUtils.isAscii('\n') = true CharUtils.isAscii('&copy;') = false </pre>
	 * @param ch  the character to check
	 * @return true if less than 128
	 */
	
	public static boolean isAscii(final char ch){
		return ch>= 'a' && ch<= 'z' || ch >='A' && ch <= 'Z' || ch == '_' || ch == '\n' || ch == '&' || ch == '$' || ch == '\'';
	}
	public static boolean isAscii(final String str){
		return!str.isEmpty() && str.matches("^[a-zA-Z0-9_\\n!\"$'`|*+-~<><]+");
	}
	
}
