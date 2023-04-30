import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID38{
	/**
	* Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
	*/
	public static int linearSearch(int[] arr, int key) {
		int i;
		for (i = head; i!= tail; i = (i + 1) % arr.length) {
			if (arr[i] == key) return i;
		}
		return -1;
    }

    public static void main (String[] args) {
		System.out.println("=== ID58 (Linear Search) ===");
		
		int p1 = linearSearch((int[])new Object[]{1, 2, 3, 7, 8, 9, 10}, 4);
}
}