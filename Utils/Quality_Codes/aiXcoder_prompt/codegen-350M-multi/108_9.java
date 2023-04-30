import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID108{
	/**
	* Removes all white spaces from a string A whitespace is identified using the Java method Character.isWhiteSpace
	*/
	public static String removeAllWhiteSpaces(String str){
		boolean flag=false;
		
		int charIndex=0;
		
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(Character.isSpace(c)){
				flag=true;
				continue;
			}
			if(!flag)
				charIndex++;
		}
		
}
}