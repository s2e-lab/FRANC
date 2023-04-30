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
			if (arr[i] == key)
				return i; //return the index where the key was found
		}
		return -1; //return -1 if the key was not found in the array
	}

	/**
	* Main method to test the linear search function
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key to search: ");
		int key = sc.nextInt();
		int index = linearSearch(arr, key);
		if (index != -1) {
			System.out.println("Key found at index " + index);
		}
		else {
			System.out.println("Key not found");
		}
	}
}