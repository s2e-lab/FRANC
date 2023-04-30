import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
			if (array == null){
					return 0;
			}
			
			int min = Integer.MAX_VALUE;
			for (int i=0;i<array.length;i++){
				min = Math.min(min,array[i]);
			}
			return min;
	}
	
	/**
	* Returns the maximum value in an array.
	*/
	public static int max(int[] array){
			if (array == null){
					return Integer.MIN_VALUE;
			}
}
}