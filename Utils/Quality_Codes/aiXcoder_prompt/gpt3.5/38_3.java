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
		return -1; // If the key is not found in the array
	}
	
	/**
	* Sort the given array using selection sort. Running time is O(n^2).
	*/
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	/**
	* Find the nth largest number in the array using selection sort. Running time is O(n^2).
	*/
	public static int findNthLargest(int[] arr, int n) {
		selectionSort(arr);
		return arr[arr.length-n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int keyIndex = linearSearch(arr, k);
		int nthLargest = findNthLargest(arr, k);
		System.out.println("Key index: " + keyIndex);
		System.out.println("Nth largest: " + nthLargest);
	}
}