import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID108{
	/**
	* Removes all white spaces from a string A whitespace is identified using the Java method Character.isWhiteSpace
	*/
	public static String removeAllWhiteSpaces(String str){
		char c;
		char[] ach=new char[str.length()];
		for(int i=0;i<str.length();i++){
			c=str.charAt(i);
			if(Character.isWhitespace(c)){
				i--;
			}
			else ch[i]=c;
		}
		String str2=new String(ch);
		return str2;
	}
 
}