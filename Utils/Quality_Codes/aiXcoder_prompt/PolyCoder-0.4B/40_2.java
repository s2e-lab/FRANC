import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
		 if(i>=0 && i<sb.length()){
				 if(String.valueOf(sb.toString(), 0,i).indexOf(" ")==-1)
					  return charAt(sb, i);
			 }
		return -1;
	}
	
	public static String findWord(StringBuffer sb, String string){
		string=string.replace(" ", "");
		String words=wordAt(sb,0);
}
}