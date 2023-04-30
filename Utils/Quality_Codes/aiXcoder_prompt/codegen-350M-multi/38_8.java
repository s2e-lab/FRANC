import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		//System.err.println(arr.length);
		int i = 0;
		while (i < arr.length && arr[i] == key){
			i++;
		}
		return i;
	}
}