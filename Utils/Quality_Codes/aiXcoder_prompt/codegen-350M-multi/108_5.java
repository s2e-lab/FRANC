import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID108{
	/**
	* Removes all white spaces from a string A whitespace is identified using the Java method Character.isWhiteSpace
	*/
	public static String removeAllWhiteSpaces(String str){
		int c;
		StringBuffer sBufer = new StringBuffer();
		
		for(int i=0; i<str.length(); i++){
			c = str.charAt(i);
			if(Character.isWhitespace(c)) sBufer.append(c);
		}

		return sBufer.toString();
	}

	/**
	* Inserts a single character and the surrounding white spaces
	*/
	public static String insert(String content, char ch){
}
}