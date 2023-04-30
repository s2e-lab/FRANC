import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
			for (int i = 0; i < arr.length; i++) {
		if (arr[i] == key)
			return i;
	}
	return -1; // if the key is not found in the array, return -1
}

/**
* Find the occurence of the given key in the given sorted array. Binary search, worst case running time is O(log n).
*/
public static int binarySearch(int[] arr, int key) {
	int left = 0;
	int right = arr.length - 1;
	while (left <= right) {
		int mid = (left + right) / 2;
		if (arr[mid] == key)
			return mid;
		else if (arr[mid] > key)
			right = mid - 1;
		else
			left = mid + 1;
	}
	return -1; // if the key is not found in the array, return -1
}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	int key = sc.nextInt();
	int index = linearSearch(arr,key);
	if(index != -1){
		System.out.println("Found at index " + index + " using linear search");
	}
	else{
		System.out.println("Not found using linear search");
	}
	Arrays.sort(arr);
	index = binarySearch(arr,key);
	if(index != -1){
		System.out.println("Found at index " + index + " using binary search");
	}
	else{
		System.out.println("Not found using binary search");
	}
}
}