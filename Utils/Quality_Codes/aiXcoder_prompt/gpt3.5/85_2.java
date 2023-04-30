import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			if(str != null && !str.isBlank() && !str.endsWith(trailing)){
		return str + trailing;
	}
	return str;
}

	/**
	* Calculates the area of the rectangle with the provided length and width
	*/
	public static int calculateArea(int length, int width){
		return length * width;
	}

	/**
	* Checks if the provided array of integers contains any duplicates
	*/
	public static boolean containsDuplicates(int[] array){
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < array.length; i++){
			if(set.contains(array[i])){
				return true;
			}
			set.add(array[i]);
		}
		return false;
	}

	/**
	* Calculates the factorial of the provided integer using recursion
	*/
	public static int calculateFactorial(int n){
		if(n == 0){
			return 1;
		}
		return n * calculateFactorial(n-1);
	}

	/**
	* Returns the nth Fibonacci number using recursion
	*/
	public static int calculateFibonacci(int n){
		if(n <= 1){
			return n;
		}
		return calculateFibonacci(n-1) + calculateFibonacci(n-2);
	}

	/**
	* Determines if the provided integer is odd
	*/
	public static boolean isOdd(int n){
		if(n % 2 == 0){
			return false;
		} else{
			return true;
		}
	}

	/**
	* Determines if the provided integer is prime
	*/
	public static boolean isPrime(int n){
		if(n <= 1){
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

}