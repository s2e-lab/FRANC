import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {   // The index is -1 if the value isn't present
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
