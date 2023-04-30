import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		String str=new String(new char[length+1],' ');
		int i=length;
		while(i>0){
			str[i]=padChar;
			i--;
		}
		return str;
	}
	public static int paddingLength(){
		char pad1;
		char pad2;
}
}