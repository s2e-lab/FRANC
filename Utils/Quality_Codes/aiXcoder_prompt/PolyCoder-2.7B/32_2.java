import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
		
if(null==array)
						return Integer.MIN_VALUE;
		int	result = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++){
				if(array[i] < result){
						result = array[i];							
				}
				
		}
		return result;  //convert the min value to a value to the array

	}
	

	/**
	* Returns the maximum value in an array.
	*/
}