import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID165{
	/**
	* Decode base64 string to bytes
	*/
	public static byte[] base64decode(String base64string){
			return Base64.getDecoder().decode(base64string);
	}
	
	/**
	* Generate an array of n random integers between min and max (inclusive)
	*/
	public static int[] generateRandomIntegers(int n, int min, int max){
		Random rand = new Random();
		int[] randomIntegers = new int[n];
		for(int i=0; i<n; i++){
			randomIntegers[i] = rand.nextInt((max - min) + 1) + min;
		}
		return randomIntegers;
	}
	
	/**
	* Compute the factorial of a non-negative integer using recursion
	*/
	public static BigInteger recursiveFactorial(int n){
		if(n==0 || n==1){
			return BigInteger.valueOf(1);
		}
		else{
			return BigInteger.valueOf(n).multiply(recursiveFactorial(n-1));
		}
	}
	
	/**
	* Compute the factorial of a non-negative integer using iteration
	*/
	public static BigInteger iterativeFactorial(int n){
		BigInteger result = BigInteger.valueOf(1);
		for(int i=1; i<=n; i++){
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}