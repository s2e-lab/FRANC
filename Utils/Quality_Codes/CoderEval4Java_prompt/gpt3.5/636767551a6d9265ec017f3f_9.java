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
			V temp = arr[i]; // store the value at index i in a temporary variable
		arr[i] = arr[j]; // overwrite the value at index i with the value at index j
		arr[j] = temp; // write the value of the temporary variable to index j
	}
	
	/** 
	 * Finds and returns the index of the maximum element in the given array.
	 * @param arr the array
	 * @return the index of the maximum element
	 */
	
	public static final int indexOfMax(int[] arr){
		int maxIdx = 0; // initialize the index of the maximum element to 0
		for(int i=1;i<arr.length;i++){
			if(arr[i]>arr[maxIdx]){ // if the current element is greater than the current maximum
				maxIdx = i; // update the index of the maximum element
			}
		}
		
		return maxIdx; // return the index of the maximum element
	}
	
	/** 
	 * Calculates and returns the average of the elements in the given array.
	 * @param arr the array
	 * @return the average of the elements
	 */
	
	public static final double average(double[] arr){
		double sum = 0; // initialize the sum of the elements to 0
		for(int i=0;i<arr.length;i++){
			sum += arr[i]; // add the current element to the sum
		}
		
		return sum/arr.length; // return the average of the elements
	}
	
	/** 
	 * Calculates and returns the median of the elements in the given array.
	 * @param arr the array
	 * @return the median of the elements
	 */
	
	public static final double median(double[] arr){
		Arrays.sort(arr); // sort the array
		
		if(arr.length%2==0){ // if the length of the array is even
			int middle = arr.length/2; // calculate the index of the middle element
			return (arr[middle-1]+arr[middle])/2.0; // return the average of the middle two elements
		}
		else{ // if the length of the array is odd
			return arr[arr.length/2]; // return the middle element
		}
	}
	
}