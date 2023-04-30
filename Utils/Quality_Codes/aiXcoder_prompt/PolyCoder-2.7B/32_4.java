import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
			if(array == null) return - 1;
			int min = array[MIN_SIZE], a = array[0], b = array[MIN_SIZE-1];
			for(int i = 0; a!= b && i < MIN_SIZE; a = array[i++], b = array[i]){
				if(a < min) min = a;
			}
			return min;
	}
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array, int size){
}
}