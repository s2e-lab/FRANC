import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
			mapObj.remove(key);
	}

	/**
	* Returns the sum of squares of all the integers in the given array.
	*/
	public static int sumOfSquares(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += Math.pow(arr[i], 2);
		}
		return sum;
	}

	/**
	* Returns true if the given string is a palindrome, false otherwise.
	*/
	public static boolean isPalindrome(String str){
		int i = 0, j = str.length() - 1;
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	/**
	* Returns the factorial of the given number.
	*/
	public static BigInteger factorial(int num){
		BigInteger fact = BigInteger.valueOf(1);
		for(int i = 1; i <= num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}