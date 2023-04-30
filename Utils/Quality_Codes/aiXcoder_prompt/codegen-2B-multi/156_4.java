import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		for ( int i = 0; i<arrayA.length; i++ ){
			float a = arrayA[i];
			if (arrayB[i]!=0){
				arrayA[i] = a + arrayB[i];
			}
		}
	}
	/**
	* Returns a new array containing the sum of all elements of given arrays.
	*/
	public static float[] sum(float[] array1, float[] array2){
		int size = array1.length + array2.length;
}
}