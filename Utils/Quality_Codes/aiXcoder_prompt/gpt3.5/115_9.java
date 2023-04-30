import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
			String[] timestampStrs = new String[timestamps.length];
		for(int i=0;i<timestamps.length;i++){
			timestampStrs[i] = String.valueOf(timestamps[i]); // Convert long to string
		}
		return timestampStrs;
	}
	
	/**
	* Sort an array of integers and return the sorted array.
	*/
	public static int[] sortArray(int[] arr){
		Arrays.sort(arr);
		return arr;
	}
	
	/**
	* Calculate the factorial of a given number and return the result as a string.
	*/
	public static String factorial(int num){
		BigInteger result = BigInteger.ONE;
		for(int i=1;i<=num;i++){
			result = result.multiply(BigInteger.valueOf(i)); // Multiply the result by i
		}
		return result.toString(); // Convert BigInteger to string
	}
	
	/**
	* Reverse a string and return the reversed string.
	*/
	public static String reverseString(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb = sb.reverse();
		return sb.toString();
	}
}