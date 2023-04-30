import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
			if(Character.isWhitespace(sb.charAt(i))){
				return sb.charAt(i);
			}else if(Character.isDigit(sb.charAt(i))){
				return Character.toLowerCase(sb.charAt(i));
			}else{
				if(i==0) return sb.charAt(0);
				else return sb.charAt(i-1);
			}
	}
	
	/**
	* Get a string from a given file.
	*/
}