import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID101{
	/**
	* Create a copy of the Integer array.
	*/
	public static int[] copy(int[] arr){
			return (int[])Array.copy(arr);
	}
	/**
	* Create a copy of the Integer array.
	*/
	public static int[] copy(int[] arr, int from, int to){
		int len = arr.length;
		int[] copy = new int[len+to-from];
		System.arraycopy(arr, from, copy, 0, len);
		return copy;
	}
	/**
	* Insert an element in the array
	*/
}