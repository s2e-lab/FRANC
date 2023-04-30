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
		return -1;
	}

	/**
	* Find the occurence of the given key in the given array. Binary search, worst case running time is O(log n).
	*/
	public static int binarySearch(int[] arr, int key) {
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	/**
	* Generate an array of size n with random integers between 0 and 100.
	*/
	public static int[] generateRandomArray(int n) {
		int[] arr = new int[n];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(101);
		}
		return arr;
	}

	/**
	* Sort the given array using bubble sort algorithm.
	*/
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/**
	* Sort the given array using selection sort algorithm.
	*/
	public static void selectionSort(int[] arr) {
		int n = arr.length;
}
}