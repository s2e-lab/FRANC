import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		// return arr.indexOf(key), if key exists.
		int left = 0, right = arr.length - 1;
		while(left <= right){
			int mid = (left + right) / 2;
			if(key < arr[mid]){
				right = mid - 1;
			}else if(key > arr[mid]){
				left = mid + 1;
			}else{
				return mid;
			}
		}

		// return -1 if key not found.
		return -1;
	}

}