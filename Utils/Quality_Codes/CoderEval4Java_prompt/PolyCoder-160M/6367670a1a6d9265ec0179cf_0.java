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
			return(ch=='X'?toChar(ch):ch);
	}
	
			
	public static char[] toCharArray(final String s){
		final char[] str=s.toCharArray();
		return(str);
	}


	public static <T> T[] toDataTypes(final String s,final int dim,final Class<T> elementType){
		final String str=s.toString();
		final Object []types=str.split(",");
		
}
}