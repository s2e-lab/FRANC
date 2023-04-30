import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
		 return sb.charAt(++i);
	 }

	/**
	* Get character i from the string buffer, by default returns <code>.</code>
	*/
	public static char getChar(){return '.';}

	/**
	* Convert String to a number
	*/
	public static Boolean asBool(String val){
		if(val.equals("true")) return true;
		if(val.equals("false")) return false;
		return null;
	}

}