import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
			for(int i=0; i<arr.length; i++) {
		if(arr[i] == key) {
			return i;
		}
	}
	return -1;
}

/**
* Check if the given number is a prime number.
*/
public static boolean isPrime(int num) {
	if(num < 2) {
		return false;
	}
	for(int i=2; i<=Math.sqrt(num); i++) {
		if(num%i == 0) {
			return false;
		}
	}
	return true;
}

/**
* Generate all pandigital numbers of the given digit length.
*/
public static ArrayList<String> generatePandigitalNumbers(int digits) {
	ArrayList<String> pandigitalNumbers = new ArrayList<>();
	int[] arr = new int[digits];
	for(int i=0; i<digits; i++) {
		arr[i] = i+1;
	}
	do {
		String number = "";
		for(int i=0; i<digits; i++) {
			number += arr[i];
		}
		pandigitalNumbers.add(number);
	} while(nextPermutation(arr));
	return pandigitalNumbers;
}

/**
* Generate the next permutation of the given array in lexicographic order.
* Return true if there is a next permutation, false otherwise.
*/
public static boolean nextPermutation(int[] arr) {
	int n = arr.length;
	int i = n-2;
	while(i>=0 && arr[i]>=arr[i+1]) {
		i--;
	}
	if(i < 0) {
		return false;
	}
	int j = n-1;
	while(arr[i]>=arr[j]) {
		j--;
	}
	swap(arr, i, j);
	reverse(arr, i+1, n-1);
	return true;
}

/**
* Swap the values at position i and j in the given array.
*/
public static void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

/**
* Reverse the elements in the given subarray.
*/
public static void reverse(int[] arr, int start, int end) {
	while(start < end) {
		swap(arr, start, end);
		start++;
		end--;
	}
}

public static void main(String[] args) throws IOException {
	ArrayList<String> pandigitalNumbers = generatePandigitalNumbers(9);
	int maxPandigitalPrime = 0;
}
}