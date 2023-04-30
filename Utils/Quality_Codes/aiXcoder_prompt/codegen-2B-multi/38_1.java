import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		for (int i=0; i< arr.length; i++)
			if (arr[i] == key )
				return i;
		return -1;
	}

	/**
	* Check if all the digits in the given number are zero
	*/
	public static boolean allZero(int number) {
		for (int i=0; i<number; i++)
			if (number%10!= 0 )
				return false;
		return true;
	}

}