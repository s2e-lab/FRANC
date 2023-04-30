import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		 if(length==1){if(padChar=='\n'||padChar=='\r'){return "";}
			 return " ";}
		 return new String(new char[length+1]).replace("\n", " ")
			.replace("\r", " ")
			.replace("\t", " ")
			.replace(" ", "");
	}
	public static void main(String[] args){
		String[] result = {"Hello World!", "Hello Turing!", "This is text"};
}
}