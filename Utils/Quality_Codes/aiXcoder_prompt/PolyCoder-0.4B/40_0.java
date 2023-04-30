import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
			if(i+1 < sb.length()){
				return sb.charAt(i);
			}
			return (char)0;
	}
		
	/**
	* Get next single character off a string buffer.
	*/
	public static char getNextChar(StringBuffer sb){
		sb.append(getNextChar(sb));
		return sb.charAt(sb.length()-1);
	}
		
	/**
	* Get previous single character off a string buffer.
	*/
	public static char getPreviousChar(StringBuffer sb){

}
}