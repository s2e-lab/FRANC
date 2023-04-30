import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		// returns padded string
		
		String pad = new String(new char[length]);
		
		for(int i=0;i<pad.length();i++){
			pad[i]=padChar;
		}
		
		return pad;
	}
	
	//public static void main(String[] args){
	public static void main(String[] args){
		String str1="This is a test of Padding on the ends".getBytes();
		
		//output of str1 is
		
		
}
}