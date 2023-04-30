import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
		if(array!=null){
			int min=array[0];
			for (int i = 1; i < array.length; i++){
				if(array[i]<min){
					min=array[i];
				}
			}
			return min;
		}
		return -1;
	}
	
	/** 
	* Returns the maximum value in an array.
	*/
	public static int max(int[] array){
}
}