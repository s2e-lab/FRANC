import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			try {
		outputStream.write(b, off, len);
	} catch (IOException e) {
		// handle exception
	}
}

/**
* Reads up to len bytes of data from the input stream into an array of bytes.
*/
public static int read(byte[] b, int off, int len, InputStream inputStream){
	try {
		return inputStream.read(b, off, len);
	} catch (IOException e) {
		// handle exception
		return -1;
	}
}

/**
* Takes a string and a character, and returns the number of times the character
* appears in the string.
*/
public static int countCharacter(String str, char c){
	int count = 0;
	for(int i = 0; i < str.length(); i++){
		if(str.charAt(i) == c){
			count++;
		}
	}
	return count;
}

/**
* Takes an integer array and returns the maximum value in the array.
*/
public static int findMax(int[] arr){
	int max = Integer.MIN_VALUE;
	for(int i = 0; i < arr.length; i++){
		if(arr[i] > max){
			max = arr[i];
		}
	}
	return max;
}

/**
* Takes a string and returns the reverse of the string.
*/
public static String reverseString(String str){
	StringBuilder sb = new StringBuilder(str);
	return sb.reverse().toString();
}

/**
* Takes a double and rounds it to the nearest integer.
*/
public static int round(double num){
	return (int) Math.round(num);
}
}