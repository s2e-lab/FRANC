import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID108{
	/**
	* Removes all white spaces from a string A whitespace is identified using the Java method Character.isWhiteSpace
	*/
	public static String removeAllWhiteSpaces(String str){
		String res="";
		int len = str.length();
		for(int i=0; i < len;i++){
			if(Character.isWhitespace(str.charAt(i)))
				res=str.substring(i);
			else
				res = str.substring(i);
		}
		return res;
	}
public static void main(String args[]) throws NumberFormatException{
}
}