import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID157{
	/**
	* Searches backward for value in a given array
	*/
	public static int lastIndexOf(float value, float[] array){
			if(value>array.length || (value==array.length && value < array[value - array.length]))//value is inside array
			{
				return array.length;
			}
			int index = array.length-1;
			return ValueMath.indexOf(array, value, value,index) ;
	}

	/**
	* Finds  of value from array
	*/
	public static float indexOf(float x, float[] array){
		return (x - array[0]) % array.length;

}
}