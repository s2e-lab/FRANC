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
	 * Generates a random array of integers with the specified length and range of values.
	 * @param length the length of the array
	 * @param min the minimum value (inclusive) of the integers
	 * @param max the maximum value (exclusive) of the integers
	 * @return the random array of integers
	 */
	
	public static int[] generateRandomArray(int length,int min,int max){
		Random rand = new Random();
		int[] arr = new int[length];
		for(int i=0;i<length;i++){
			arr[i] = rand.nextInt(max-min) + min;
		}
		return arr;
	}
	
	/**
	 * Converts a string representation of an integer array to an actual integer array.
	 * @param str the string representation of the integer array
	 * @return the integer array
	 */
	
	public static int[] stringToIntArray(String str){
		String[] strArr = str.trim().split("\\s+");
		int[] arr = new int[strArr.length];
		for(int i=0;i<strArr.length;i++){
			arr[i] = Integer.parseInt(strArr[i]);
		}
		return arr;
	}
	
	/**
	 * Converts an integer array to its string representation.
	 * @param arr the integer array
	 * @return the string representation of the integer array
	 */
	
	public static String intArrayToString(int[] arr){
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<arr.length;i++){
			builder.append(arr[i]);
			if(i!=arr.length-1){
				builder.append(" ");
			}
		}
		return builder.toString();
	}
	
	/**
	 * Calculates the sum of an array of integers.
	 * @param arr the array of integers
	 * @return the sum of the integers in the array
	 */
	
	public static int arraySum(int[] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		return sum;
	}
	
	/**
	 * Sorts an array of integers in ascending order using the selection sort algorithm.
	 * @param arr the array of integers
	 */
	
	public static void selectionSort(int[] arr){
}
}