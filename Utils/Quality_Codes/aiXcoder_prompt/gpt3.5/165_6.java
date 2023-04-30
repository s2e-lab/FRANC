import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID165{
	/**
	* Decode base64 string to bytes
	*/
	public static byte[] base64decode(String base64string){
			// Implement the base64 decoding logic

			return Base64.getDecoder().decode(base64string);
	}

	/**
	* Encode bytes to base64 string
	*/
	public static String base64encode(byte[] bytes){
		// Implement the base64 encoding logic

		return Base64.getEncoder().encodeToString(bytes);
	}

	/**
	* Convert BigInteger to binary string
	*/
	public static String bigIntToBinaryString(BigInteger bigInt){
		// Implement the BigInteger to binary string conversion logic

		return bigInt.toString(2);
	}

	/**
	* Convert binary string to BigInteger
	*/
	public static BigInteger binaryStringToBigInt(String binaryString){
		// Implement the binary string to BigInteger conversion logic

		return new BigInteger(binaryString, 2);
	}

	/**
	* Compute the length of the longest common prefix of two strings
	*/
	public static int longestCommonPrefix(String str1, String str2){
		// Implement the longest common prefix logic

		int length = 0;
		while(length < str1.length() && length < str2.length()){
			if(str1.charAt(length) != str2.charAt(length)){
				return length;
			}
			length++;
		}
		return length;
	}

	/**
	* Compute the arithmetic mean of an array of double values
	*/
	public static double arithmeticMean(double[] arr){
		// Implement the arithmetic mean calculation logic

		double sum = 0;
		for(double num : arr){
			sum += num;
		}
		return sum / arr.length;
	}
}

// Sample usage
// byte[] bytes = ID165.base64decode("SGVsbG8gV29ybGQh");
// String base64String = ID165.base64encode(bytes);
// String binaryString = ID165.bigIntToBinaryString(BigInteger.TEN);
// BigInteger bigInt = ID165.binaryStringToBigInt(binaryString);
// int prefixLength = ID165.longestCommonPrefix("hello", "heaven");
// double mean = ID165.arithmeticMean(new double[]{1.0, 2.0, 3.0});