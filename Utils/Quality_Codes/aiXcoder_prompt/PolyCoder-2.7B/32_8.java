import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
			if(array == null || array.length == 0){
				 return 0;
			}
			Integer min = array[0];
			for (int i = 1 ; i < array.length ; i++) {
				 if(array[i].compareTo(min) > 0){
					 min = array[i];
				 }
			}
			return min.intValue();
	}
	/**
	* Returns the first index of a given value
	* @param array
	* @param element
	*/
}