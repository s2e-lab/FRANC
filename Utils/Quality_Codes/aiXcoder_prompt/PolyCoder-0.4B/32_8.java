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
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array,int[] limit){
		if(0==limit)
			return array[0];
		else 
			return min(array,limit);
	}

	/**
	* Returns the maximum value in an array
	*/
	public static int max(int[] array){
		if(0==array)
			return null;
}
}