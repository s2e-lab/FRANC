import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID13{
	/**
	* Returns a string, consisting of given length random char from given alphabet. 
	*/
	public static String randomString(int length, String alphabet){
		char[] strArray = new char[length];
		for(int i = 0; i < strArray.length; i++){
			strArray[i] = alphabet.charAt(Math.abs(new java.util.Random().nextInt()) % alphabet.length());
		}		
		return String.copyValueOf(strArray);
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt()-1;
}
}