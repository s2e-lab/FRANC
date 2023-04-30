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
	 * Reverses the order of elements in the given array.
	 * @param < V > 
	 * @param arr the array to be reversed
	 */
	public static final <V>void reverse(V[] arr){
		int i = 0;
		int j = arr.length -1;
		
		while(i < j){
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	
	/**
	 * Prints the elements of the given integer array.
	 * @param arr the integer array to be printed
	 */
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Prints the elements of the given double array.
	 * @param arr the double array to be printed
	 */
	public static void printArray(double[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Prints the elements of the given character array.
	 * @param arr the character array to be printed
	 */
	public static void printArray(char[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Prints the elements of the given boolean array.
	 * @param arr the boolean array to be printed
	 */
	public static void printArray(boolean[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Prints the elements of the given object array.
	 * @param < V > 
	 * @param arr the object array to be printed
	 */
	public static final <V>void printArray(V[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
