import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
			int n = arr.length;
		for(int i=0; i<n; i++){
			if(arr[i] == key){
				return i; //Return the index where key is found
			}
		}
		return -1; //If key is not found, return -1
	}
	
	/**
	* Method to test the linearSearch function with sample input.
	*/
	public static void main(String[] args) {
		int[] arr = {10, 23, 12, 45, 67, 89, 34};
		int key = 45;
		int index = linearSearch(arr, key);
		if(index == -1){
			System.out.println(key +" not found in the given array");
		}
		else{
			System.out.println(key +" found at index "+ index +" in the given array");
		}
	}
}