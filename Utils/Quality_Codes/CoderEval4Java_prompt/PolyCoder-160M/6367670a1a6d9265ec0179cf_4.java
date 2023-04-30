import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CharUtils{
	/** 
	 * <p>Converts the Character to a char handling <code>null</code>.</p> <pre> CharUtils.toChar(null, 'X') = 'X' CharUtils.toChar(' ', 'X')  = ' ' CharUtils.toChar('A', 'X')  = 'A' </pre>
	 * @param ch  the character to convert
	 * @param defaultValue  the value to use if the  Character is null
	 * @return the char value of the Character or the default if null
	 */
	
	public static char toChar(final Character ch,final char defaultValue){
		 
		final char [] chars = CharUtils.toCharArray(ch);
		final int lenMax = chars.length;
		final char[] chars0= CharUtils.toCharArray(new Character [lenMax]);
		
		for (int i = 0; i < lenMax; i++) {
			chars0[i]=chars[i];
		}
		
		return (CharUtils.toChar(chars0, defaultValue)); 
	}

	public static long toLong(final char[] chars,final Long defaultValue){
		 
}
}