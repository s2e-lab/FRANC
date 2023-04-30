import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		int strLen = str.length();
		int trailingLen = trailing.length();
		int temp = strLen;
		int temp2 = trailingLen;
		
		System.out.println("temp: " + temp);
		System.out.println("temp2: " + temp2);
		
		str = str.substring(0,strLen-1) + trailing;
		
		return str;
	} 
}
