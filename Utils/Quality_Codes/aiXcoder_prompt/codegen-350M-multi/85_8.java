import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		if(str==null)str=new String();
		return new String(str).concat(trailing);
	}
	
	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}