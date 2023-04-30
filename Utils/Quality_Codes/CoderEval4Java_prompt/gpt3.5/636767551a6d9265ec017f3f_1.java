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
	 * Sorts the given array in ascending order using the insertion sort algorithm.
	 * @param <V> the type of elements in the array
	 * @param arr the array to be sorted
	 */
	public static final <V extends Comparable<V>>void insertionSort(V[] arr){
		for(int i=1;i<arr.length;i++){
			V key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j].compareTo(key)>0){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	/**
	 * Sorts the given array in ascending order using the selection sort algorithm.
	 * @param <V> the type of elements in the array
	 * @param arr the array to be sorted
	 */
	public static final <V extends Comparable<V>>void selectionSort(V[] arr){
		for(int i=0;i<arr.length-1;i++){
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j].compareTo(arr[minIndex])<0){
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
	}
	
	/**
	 * Sorts the given array in descending order using the bubble sort algorithm.
	 * @param <V> the type of elements in the array
	 * @param arr the array to be sorted
	 */
	public static final <V extends Comparable<V>> void bubbleSortDescending(V[] arr){

		for(int i=arr.length-1;i>=0;i--){
			boolean swap = false;
			for(int j=0;j<i;j++){
				if(arr[j].compareTo(arr[j+1])<0){
					swap(arr, j, j+1);
					swap = true;
				}
			}
			if(!swap){ 
				break;
			}
		}
	}
	
	/**
	 * Sorts the given integer array in ascending order using the counting sort algorithm.
	 * @param arr the integer array to be sorted
	 */
	public static final void countingSort(int[] arr){
		if(arr.length==0){
			return;
		}
		int min = arr[0];
}
}