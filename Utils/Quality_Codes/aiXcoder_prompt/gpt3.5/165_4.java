import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID165{
	/**
	* Decode base64 string to bytes
	*/
	public static byte[] base64decode(String base64string){
			byte[] decodedBytes = Base64.getDecoder().decode(base64string);
		return decodedBytes;
	}

	/**
	* Encode bytes to base64 string
	*/
	public static String base64encode(byte[] bytes){
		String encodedString = Base64.getEncoder().encodeToString(bytes);
		return encodedString;
	}

	/**
	* Reverse words in a sentence
	*/
	public static String reverseWords(String sentence){
		String[] words = sentence.split(" ");
		StringBuilder reversedSentence = new StringBuilder();
		for(int i=words.length-1; i>=0; i--){
			reversedSentence.append(words[i] + " ");
		}
		return reversedSentence.toString().trim();
	}

	/**
	* Convert a decimal number to binary
	*/
	public static String decimalToBinary(int decimal){
		return Integer.toBinaryString(decimal);
	}

	/**
	* Compute the square root of a number
	*/
	public static double squareRoot(double num){
		return Math.sqrt(num);
	}
}