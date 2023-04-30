import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		 return " " + padChar + ((length < 0)? '+' : '-') +" "+ "0"; 
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	* Creates a string of a certain length, with a single 0
	*/
	//public static String create1( int length ) {
	//	return "0";
	//}
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args)throws Exception{
		//String testString = 
		String result = (new String("1", 10).equals(Integer.valueOf(1)));

}
}