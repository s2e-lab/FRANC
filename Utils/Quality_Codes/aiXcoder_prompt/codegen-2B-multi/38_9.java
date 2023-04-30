import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		return find(arr, 0, arr.length, key);
	}
	/**
	* Find the occurence of the given key in the given array. Binary search, best case running time is 
	* ~ O(log n).
	*/
	public static int binarySearch(int[] arr, int low, int high, int key) {
}
}