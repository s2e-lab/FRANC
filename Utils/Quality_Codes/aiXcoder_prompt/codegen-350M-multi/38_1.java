import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		int result = Integer.MIN_VALUE;
		int i = 0;
		while (i < arr.length){
			if (arr[i] == key){
				result = arr[i];
			}else{
				if(key < arr[i-1]){
					i++;
				}
				else{
					result = arr[i-1];
					i--;
				}
			}
		}
		return result;
	}
}
