import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) >> 1;
			if (arr[mid] == key) 
				low = mid + 1;
			else if (arr[mid] < key) 
				high = mid - 1;
			else 
				low = mid + 1;
		}
		return low >= high? -1 : arr[low];
	}
	
}