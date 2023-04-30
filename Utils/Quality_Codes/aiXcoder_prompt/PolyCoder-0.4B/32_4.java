import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
			int min = Integer.MIN_VALUE;
			for(int item: array){
				if(item < min){
					min = item;
				}
			}
			return min;
	}

	/**
	* Returns the maximum value in an array.
	*/
	public static int max(int[] array){
		int max = Integer.MAX_VALUE;
		for(int item: array){
			if(item > max){
				max = item;
			}
		}
}
}