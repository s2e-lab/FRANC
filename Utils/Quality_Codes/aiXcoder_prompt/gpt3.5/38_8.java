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
			if (arr[i] == key)
				return i;
		}
		return -1;
	}
	
	/**
	* Sort the given array in ascending order using selection sort. Worst case running time is O(n^2).
	*/
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	/**
	* Calculate the factorial of a given number using recursion.
	*/
	public static BigInteger factorial(long n) {
		if (n == 0)
			return BigInteger.valueOf(1);
		else
			return BigInteger.valueOf(n).multiply(factorial(n-1));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Finding the occurence of a key in an array
		System.out.println("Enter the size of the array:");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter the key to search:");
		int key = in.nextInt();
		int index = linearSearch(arr, key);
		if (index != -1)
			System.out.println("Key found at index " + index);
		else
			System.out.println("Key not found in the array");
		
		// Sorting an array using selection sort
		System.out.println("Enter the size of the array:");
		n = in.nextInt();
		arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		selectionSort(arr);
		System.out.println("Sorted array: " + Arrays.toString(arr));
		
		// Calculating factorial of a number
}
}