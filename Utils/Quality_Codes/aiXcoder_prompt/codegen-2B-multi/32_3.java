import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
		int n = array.length;
		int min = array[0];
		for(int i=1; i<n; i++){
			if(array[i]<min){
				min = array[i];
			}
		}
		return min;
	}
	
	/**
	* Returns the maximum value in an array.
	*/
	public static int max(int[] array){
		int n = array.length;
		int max = array[0];
}
}