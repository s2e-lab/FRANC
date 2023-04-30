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
		return ch < 128;
	}

	/** 
	 * <p>Checks whether the character is ASCII 7 bit. 
	 * An exception is thrown if the character is not ASCII 7 bit.</p>
	 * @param ch  the character to check
	 */
	
	public static void checkAscii(final char ch){
		if(!isAscii(ch)) throw new IllegalArgumentException("The character '" + ch + "' is not ASCII.");
	}

}