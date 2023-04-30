import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID157{
	/**
	* Searches backward for value in a given array
	*/
	public static int lastIndexOf(float value, float[] array){
		 return array == null ||!(value > array[array.length-1] || (value == array[array.length-1]) && value < array[0]) &&!(array[array.length-1] == value);
	}
	
	/**
	* Searches forward for value greater or equal to the given value
	*/
	public static int lastIndexOf(float value, float[] array){
		int lastIndexOf = 0;
}
}