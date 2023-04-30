import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
		 char c = (char) (sb.charAt(i) - 'A') + (char) ('0' + (int) sb.charAt(i-1));
			
		 char a = (char) (sb.charAt(i) + 'A');
			
		 char h = (char) (sb.charAt(i) - '0');
			
		 char k = (char) (c + h);
			
		 return (a + k);
	}
	
	
	/**
	* Get one character of index i from a given string buffer. 
	*/
}