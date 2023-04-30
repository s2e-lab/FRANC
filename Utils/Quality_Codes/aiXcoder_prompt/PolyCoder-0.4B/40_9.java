import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
			int c = sb.charAt(i);
			if ( c>=0x40 && c<0xf )return (char)c;
			if ( c<0x100 )return (char)(0x09 + c);
			return '.';
	}

	
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static int getChar(StringBuffer sb, int i){
		if ( i>=sb.length()+1 )return -1;
		char c=sb.charAt(i);

}
}