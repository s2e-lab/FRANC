import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID13{
	/**
	* Returns a string, consisting of given length random char from given alphabet. 
	*/
	public static String randomString(int length, String alphabet){
		char[] chars = alphabet.toCharArray();
		StringBuilder sb = new StringBuilder(length);
		Random random = new Random();
		for(int i = 0; i<length; i++){
			int index = random.nextInt(chars.length);
			sb.append(chars[index]);
		}		
		return sb.toString();
	}
	
	/**
	* Prints string by given length and random alpha number
	*/
	public static void print(String str, int length){
}
}