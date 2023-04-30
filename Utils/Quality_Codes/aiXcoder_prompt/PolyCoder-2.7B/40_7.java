import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
		 return sb.charAt(1 + i);
	}
	
	/**
	* Get first substring after index i that starts with prefix.
	*/
	public static String getSubStringAfter(StringBuffer sb, int i, String prefix) {
		
		
		 return sb.length() > 0? sb.substring(0, i+prefix.length()) : prefix;
		
	}
	
	/**
	* Get first substring before index i that starts with prefix.
	*/
	public static String getSubStringBefore(StringBuffer sb, int i, String prefix) {
		
}
}