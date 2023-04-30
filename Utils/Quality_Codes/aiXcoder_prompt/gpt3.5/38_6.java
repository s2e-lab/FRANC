import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
			for (int i = 0; i < arr.length; i++) {
		if (arr[i] == key) {
			return i;
		}
	}
	return -1; // key not found
}

/**
* Sorts the given array using selection sort. Worst case running time is O(n^2).
*/
public static void selectionSort(int[] arr) {
	for (int i = 0; i < arr.length - 1; i++) {
		int minIndex = i; // index of smallest element in unsorted array
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[minIndex]) {
				minIndex = j;
			}
		}
		// swap the smallest element with the leftmost element in the unsorted array
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
	}
}

/**
* Calculates the sum of the first n natural numbers using the formula n(n+1)/2. 
* Returns -1 if n is not a positive integer.
*/
public static int sumOfFirstN(int n) {
	if (n <= 0) {
		return -1;
	} else {
		return (n * (n + 1)) / 2;
	}
}

/**
* Calculates the factorial of the given number. Returns -1 if n is negative.
*/
public static int factorial(int n) {
	if (n < 0) {
		return -1;
	} else if (n == 0) {
		return 1;
	} else {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
}

/**
* Tests the above methods.
*/
public static void main(String[] args) {
	// Test linear search
	int[] arr = {1, 2, 3, 4, 5};
	int key = 3;
	int index = linearSearch(arr, key);
	System.out.println("Index of " + key + " in array: " + index);

	// Test selection sort
	int[] arr2 = {5, 4, 3, 2, 1};
	selectionSort(arr2);
	System.out.println("Sorted array: " + Arrays.toString(arr2));

	// Test sum of first n numbers
}
}