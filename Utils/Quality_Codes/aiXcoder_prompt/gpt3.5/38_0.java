import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
			int n = arr.length;
	for (int i = 0; i < n; i++) {
		if (arr[i] == key) {
			return i;
		}
	}
	return -1; // key not found
}

/**
* Sort the given array in ascending order using Bubble Sort.
*/
public static void bubbleSort(int[] arr) {
	int n = arr.length;
	for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n-i-1; j++) {
			if (arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
}

/**
* Calculate the factorial of n using recursion.
*/
public static BigInteger factorial(int n) {
	if (n == 0) {
		return BigInteger.ONE;
	} else {
		return BigInteger.valueOf(n).multiply(factorial(n-1));
	}
}

/**
* Convert the given string to an array of characters and return the array.
*/
public static char[] toCharArray(String str) {
	char[] arr = new char[str.length()];
	for (int i = 0; i < str.length(); i++) {
		arr[i] = str.charAt(i);
	}
	return arr;
}

/**
* Reverse the order of the elements in the given array.
*/
public static void reverseArray(int[] arr) {
	int n = arr.length;
	for (int i = 0; i < n/2; i++) {
		int temp = arr[i];
		arr[i] = arr[n-i-1];
		arr[n-i-1] = temp;
	}
} 
}