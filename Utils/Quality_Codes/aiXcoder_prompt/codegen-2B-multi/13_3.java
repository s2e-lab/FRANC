import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID13{
	/**
	* Returns a string, consisting of given length random char from given alphabet. 
	*/
	public static String randomString(int length, String alphabet){
		java.util.Random r = new java.util.Random();
		StringBuilder sb = new StringBuilder(length);
		for(int i=0; i<length; i++) sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
		return sb.toString();
	}
	
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
}
}