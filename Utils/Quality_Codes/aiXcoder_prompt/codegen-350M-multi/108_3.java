import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID108{
	/**
	* Removes all white spaces from a string A whitespace is identified using the Java method Character.isWhiteSpace
	*/
	public static String removeAllWhiteSpaces(String str){
		char[] cbuf = str.toCharArray();
		int i=0;
		while (i<cbuf.length){
			if (Character.isWhitespace(cbuf[i])){
				//System.out.print(cbuf[i]+"\t");
				cbuf[i]=0;
				i++;
			}else{
				break;
			}
		}
		return new String(cbuf);
	}

	/**
	* Removes all non-whitespace characters from a string A
	*/

}