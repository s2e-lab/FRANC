import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ArrayUtil{
	/** 
	 * Swaps the two elements at the specified indices in the given array.
	 * @param < V > the type of elements in the array
	 * @param arr the array
	 * @param i the index of the first element
	 * @param j the index of the second element
	 */
	
	public static final <V>void swap(V[] arr,int i,int j){
			V temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
	}
	
	/**
	 * Returns a random integer between min and max, inclusive.
	 * @param min the minimum value
	 * @param max the maximum value
	 * @return a random integer between min and max, inclusive.
	 */
	public static int randomInt(int min,int max){
		return (int)(Math.random() * (max - min + 1) + min);
	}
	
	/**
	 * Returns a random integer between 0 and max, inclusive.
	 * @param max the maximum value
	 * @return a random integer between 0 and max, inclusive.
	 */
	public static int randomInt(int max){
		return randomInt(0,max);
	}
}
