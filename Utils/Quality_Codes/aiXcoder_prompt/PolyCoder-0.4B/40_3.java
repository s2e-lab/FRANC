import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
		 if( i == sb.length()){
			 return '(';
		 }
		 return sb.charAt(i++);
	}
	

		/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i, int start){
		 if( start > i)
			 return getChar(sb, start);
		 return (char) sb.charAt(i + start);
	}

	/**
	* Get one n character of index i from a given string buffer.
	*/

}