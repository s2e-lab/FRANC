import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
			char ret=0;
			for(int j=0;j<10;j++){
					ret=ret*10+sb.charAt(i+j);
			}

			return ret;
	}

	/**
	* Get one word of index i from a given string buffer.
	*/
	public static String toTitle(StringBuffer sb, int i){
			String ret="";
			for(int j=0;j<10;j++){
					ret+=sb.charAt(i+j);
			}
}
}