import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		String str = "";
		for(int i = 0; i < length; i++){
			str = str + padChar;
		}
		return str;
	}
    	
	public static String createRandomString(){
		Random rand = new Random();
		int length = rand.nextInt(10) + 6;
		String padChar="";
}
}