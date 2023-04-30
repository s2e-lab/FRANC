import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
			if(i>=sb.length()){
				   return((char)0);
				}
		
		char chr=sb.charAt(i); //This should work fine but is slow as all the bytes will be shifted by 1, which doesnt matter if they are all one byte or not
		
}
}