import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
		 return array[0];
	}
	
	/**
	* Returns the maximum value in an array.
	*/
	public static int max(int[] array){
		 int max = Integer.MIN_VALUE;
		 for (int i=0;i<array.length;i++){
			 if (max < array[i])
				max = array[i];
		 }
		 return max;
	}
	
	final int[][] grid;
}