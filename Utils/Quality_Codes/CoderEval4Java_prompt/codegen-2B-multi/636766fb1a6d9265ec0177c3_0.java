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
		return
				0 == ch
				|| 	32 == ch
				||   65 == ch
				||   90 == ch
				||  97 == ch
				|| 123 == ch
				|| 126 == ch
				|| 128 == ch
				|| 129 == ch
				|| 160 == ch
				|| 97 == ch
				|| 105 == ch
				;
	}


}