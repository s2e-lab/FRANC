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
	 * Reverses the elements in the given array.
	 * @param <V> the type of elements in the array
	 * @param arr the array
	 */
	public static final <V>void reverse(V[] arr) {
		if(arr == null || arr.length <= 1) {
			return;
		}
		int i = 0, j = arr.length - 1;
		while(i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	/**
	 * Sorts the given array using bubble sort.
	 * @param <T> the type of elements in the array (must be comparable)
	 * @param arr the array
	 */
	public static final <T extends Comparable<T>>void bubbleSort(T[] arr) {
		if(arr == null || arr.length <= 1) {
			return;
		}
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	/**
	 * Sorts the given array using insertion sort.
	 * @param <T> the type of elements in the array (must be comparable)
	 * @param arr the array
	 */
	public static final <T extends Comparable<T>>void insertionSort(T[] arr) {
		if(arr == null || arr.length <= 1) {
			return;
		}
		for(int i = 1; i < arr.length; i++) {
			T curr = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j].compareTo(curr) > 0) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = curr;
		}
	}
	
	/**
	 * Sorts the given array using selection sort.
	 * @param <T> the type of elements in the array (must be comparable)
	 * @param arr the array
	 */
	public static final <T extends Comparable<T>>void selectionSort(T[] arr) {
	
}
}