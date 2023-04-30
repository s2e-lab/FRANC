import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		int index = Arrays.binarySearch(arr, key);

		if (index < 0)
			return index;
		else
			return index+1;
	}
}
	 