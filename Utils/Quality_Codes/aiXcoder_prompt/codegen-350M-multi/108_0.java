import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID108{
	/**
	* Removes all white spaces from a string A whitespace is identified using the Java method Character.isWhiteSpace
	*/
	public static String removeAllWhiteSpaces(String str){
		String newval = "";
		for (int i=0;i<(str.length()-1);i++){
			if(Character.isWhitespace(str.charAt(i)))newval+=" ";
		}

		return newval;
	}
	
	private static String newString(String str){
		int counter=0;
		String string=(null);
}
}