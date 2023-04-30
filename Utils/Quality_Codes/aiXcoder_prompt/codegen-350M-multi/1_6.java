import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		if(length == 0){
			return "0";
		}
		String result=new String();
		while(length-->0){
			result=result+padChar;
		}
		return result;
	}	
	
	/**
	* Prints to standard output
	*/
	public static void printToStandardOutput(String str){
		System.out.println(str);
	}	
	/**
	* Prints to standard output and escapes a given character
	*/
}