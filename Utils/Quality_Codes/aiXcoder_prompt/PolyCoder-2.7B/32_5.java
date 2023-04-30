import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
		 int min=Math.min(array.length,array.length);		// return index of minimum value.
		return array[min];
	}	int minimum;


	/**
	* Returns the maximum value in an array.
	*/
	public static int max(int[] array){
		int max=0;
		for (int anInt : array){
			if (max<anInt){
				max=anInt;
			}
		}
		return max;
	}

}