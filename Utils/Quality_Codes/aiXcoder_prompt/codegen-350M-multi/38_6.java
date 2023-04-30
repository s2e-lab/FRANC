import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		int maxi = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxi) {
				maxi = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return maxi;
	}

}