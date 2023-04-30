import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID13{
	/**
	* Returns a string, consisting of given length random char from given alphabet. 
	*/
	public static String randomString(int length, String alphabet){
		StringBuilder str = new StringBuilder((length+2)*5);
		Random randomGenerator = new Random();

		for(int n=0;n<length;n++){
			str.append(alphabet.charAt(randomGenerator.nextInt(alphabet.length())));
		}
		str.append('#');
		str.append(' ');
		return str.toString();
	} 

    public static void rotate(char[] a, int n) {
}
}