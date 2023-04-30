import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		assert(arr!= null);
		return linearSearch(arr, key, arr.length - 1);
	}

	/*
	* Linear search.
	*/
	static int linearSearch(int[] arr, int key, int pos) {
		if (arr == null) return pos;
		int min = pos + 1;
		int len = arr.length;
}
}