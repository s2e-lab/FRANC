import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		for(int i=0;i<arr.length;i++)
			if(arr[i]==key)
				return i;
		return -1;
	}



	/**
	* Find the maximum value in the n-th dimension (starting with 0) of the given array.
	* @param arr - an integer array
	* @param n - an integer
	* @return - an integer
	*/
	public static int largestOnDimension(int[] arr,int n) {
}
}