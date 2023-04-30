import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		String padCharString;
		if(length<=0){
			return "";
		}
		padCharString = padChar+"0";
		String paddedString = "";
		for(int i=0;i<length;i++){
			paddedString+=padChar;
		}
		return paddedString;
	}

	/**
	* Creates a padding string of a certain length with given prefix
	*/
	public static String createPadding(int length, String prefix){
}
}