import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
		 if(i<sb.length()) return sb.charAt(i);
		 else return'';
	}
	/**
	* Check whether the string is a valid input for ID40_XXX class.
	* @param buf
	* @return boolean
	*/
	public static boolean check(byte[] buf){
		 if(buf==null || buf.length!=ID40.LENGTH ) return false;
		 return Arrays.equals(ID40.toCharsArray(buf),ID40.toArray(buf));
		}
	public static class Chars extends StringBuffer{
}
}