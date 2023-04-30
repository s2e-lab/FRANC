import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
		int min = array[0];
		for(int a: array){
			if(min > a){
				min = a;
			}
		}
		return min;
	}

	/**
	* Returns the bit of a number.
	*/
	public static int bit(int n, int k){
		return n &1 << k;
	}

	public static boolean isPrime(int n){
		//Check if we are an integer
}
}