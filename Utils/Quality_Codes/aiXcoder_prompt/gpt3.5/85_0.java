import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			if(str != null && !str.trim().isEmpty() && !str.endsWith(trailing)){
				return str + trailing;
			}
			return str;
		}

	/**
	* Takes in two integers as arguments and returns their sum
	*/
	public static int sum(int a, int b){
		return a + b;
	}

	/**
	* Takes in an array of integers as argument and returns their sum
	*/
	public static int arraySum(int[] arr){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}

	/**
	* Takes in two arrays of integers as arguments and returns their concatenation
	*/
	public static int[] concatArrays(int[] arr1, int[] arr2){
		int[] result = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, result, 0, arr1.length);
		System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
		return result;
	}

	/**
	* Takes in an array of integers as argument and returns the minimum value
	*/
	public static int findMin(int[] arr){
		int min = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}

	/**
	* Takes in a string as argument and returns true if it is a palindrome, false if not
	*/
	public static boolean isPalindrome(String str){
		if(str == null){
			return false;
		}
		str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	/**
	* Takes in a positive integer as arguments and returns true if it is a prime number, false if not
	*/
	public static boolean isPrime(int number){
		if(number < 2){
			return false;
		}
		for(int i=2; i<=number/2; i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}
}