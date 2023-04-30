import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CommonCodeUtils{
	/** 
	 * Decoding a string to a string follow the Base64 regular. 
	 */
	
	public static String base64Decode(final String s){
			byte[] decodedBytes = Base64.getDecoder().decode(s);
			return new String(decodedBytes);
		}
	
	/**
	 * Encoding a string to a string follow the Base64 regular.
	 */
	
	public static String base64Encode(final String s){
		byte[] encodedBytes = Base64.getEncoder().encode(s.getBytes());
		return new String(encodedBytes);
	}
	
	/**
	 * Calculating the N-th Fibonacci number.
	 */
	
	public static int fibonacci(int n){
		if(n<=1){
			return n;
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	/**
	 * Checking whether a given number is prime or not.
	 */
	
	public static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Calculating the factorial of a given number.
	 */
	
	public static BigInteger factorial(int n){
		BigInteger result = BigInteger.valueOf(1);
		for(int i=1;i<=n;i++){
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
	
}