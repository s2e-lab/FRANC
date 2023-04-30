import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		if(padLength==0 || padLength<=length) return "";
		char[] array = new char[length];
		for(int i=0; i<length; i++) array[i] = padChar;
		return new String(array);
	}

	/**
	* Returns whether the input contains an integer
	*/
	public static boolean containsInt(String input){
		char a = input.charAt(0);
		//if one char has an + sign, then it must have a leading zero.
}
}