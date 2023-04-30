import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID107{
	/**
	* Return true if the given array is not null or empty.
	*/
	public boolean checkNotNullOrEmpty(int[] array){
			if(array != null && array.length > 0){
			return true;
		}
		return false;
	}

	/**
	* Sorts the given array in ascending order using bubble sort algorithm.
	*/
	public int[] bubbleSort(int[] array){
		if(!checkNotNullOrEmpty(array)){
			return null;
		}

		int n = array.length;
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-i-1; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args){
		ID107 obj = new ID107();
		int[] arr1 = new int[]{9, 7, 8, 3, 2, 1, 10, 6, 5, 4};
		int[] arr2 = new int[]{};
		int[] arr3 = null;

		System.out.println("Before sorting: " + Arrays.toString(arr1));
		obj.bubbleSort(arr1);
		System.out.println("After sorting: " + Arrays.toString(arr1));

		System.out.println("Before sorting: " + Arrays.toString(arr2));
		obj.bubbleSort(arr2);
		System.out.println("After sorting: " + Arrays.toString(arr2));

		System.out.println("Before sorting: " + Arrays.toString(arr3));
		obj.bubbleSort(arr3);
		System.out.println("After sorting: " + Arrays.toString(arr3));
	}
}