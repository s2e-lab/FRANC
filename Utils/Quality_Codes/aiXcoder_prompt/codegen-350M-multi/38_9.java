import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length - 1;

		while (hi > lo) {
			int mid = lo + ((hi - lo) / 2);
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		return -1;
	}


}