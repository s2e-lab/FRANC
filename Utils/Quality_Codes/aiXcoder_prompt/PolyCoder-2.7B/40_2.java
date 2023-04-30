import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
		 if((i+2) < sb.length()){return sb.charAt(i);}
		 else{sb.insert(i, " "); return '"';}

	}

	/**
	* Get one number of the first two characters of array of two int's and concatenate them.
	*/
	public static String getString(int[] i1, int[] i2){
		int[] res = new int[i1.length+i2.length];
}
}