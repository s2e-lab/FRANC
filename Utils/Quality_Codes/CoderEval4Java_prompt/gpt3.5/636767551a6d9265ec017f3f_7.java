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
	 * Reverses the order of the elements in the given array.
	 * @param < V > the type of elements in the array
	 * @param arr the array
	 */
	public static final <V> void reverse(V[] arr){
		int start = 0;
		int end = arr.length-1;
		
		while(start<end){
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	
	/** 
	 * Creates a copy of the given array and returns it.
	 * @param < V > the type of elements in the array
	 * @param arr the array
	 * @return a copy of the given array
	 */
	public static final <V> V[] copyArray(V[] arr){
		return Arrays.copyOf(arr, arr.length);
	}
	
	/** 
	 * Prints the elements in the given array to standard output.
	 * @param < V > the type of elements in the array
	 * @param arr the array
	 */
	public static final <V> void printArray(V[] arr){
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
}