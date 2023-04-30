import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
			/**
			 * Initialize the array with the minimum value.
			 * @param array the array to be filled.
			 * @param n the actual array size.
			 */
			int minSize=(array.length<0)?0:array.length;
			min(array,0,minSize);
			return minSize;
	}

}