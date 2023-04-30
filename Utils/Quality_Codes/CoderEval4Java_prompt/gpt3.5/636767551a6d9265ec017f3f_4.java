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
	 * Returns the index of the minimum element in the given array.
	 * @param < V > the type of elements in the array
	 * @param arr the array
	 * @return the index of the minimum element
	 */
	public static final <V extends Comparable<V>>int getMinIndex(V[] arr){
		int minIndex = 0;
		V minValue = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(minValue) < 0) {
				minValue = arr[i];
				minIndex = i;
			}
		}
		
		return minIndex;
	}

	/** 
	 * Returns the index of the maximum element in the given array.
	 * @param < V > the type of elements in the array
	 * @param arr the array
	 * @return the index of the maximum element
	 */
	public static final <V extends Comparable<V>>int getMaxIndex(V[] arr){
		int maxIndex = 0;
		V maxValue = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(maxValue) > 0) {
				maxValue = arr[i];
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}

	/** 
	 * Returns the sum of all elements in the given array.
	 * @param arr the array
	 * @return the sum of all elements
	 */
	public static final int getSum(int[] arr){
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}

	/** 
	 * Returns the average of all elements in the given array.
	 * @param arr the array
	 * @return the average of all elements
	 */
	public static final double getAverage(int[] arr){
		return getSum(arr) / (double)arr.length;
	}
}
