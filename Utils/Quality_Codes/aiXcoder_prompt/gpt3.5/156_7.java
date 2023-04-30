import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			if(arrayA.length == arrayB.length){
		for(int i=0; i<arrayA.length; i++){
			if(i<arrayB.length){
				arrayA[i] += arrayB[i];
			}
		}
	}
}
	/**
	* Multiplies every element of an array by a given scalar.
	*/	
	public static void scalarMultiply(float[] array, float scalar){
		for(int i=0; i<array.length; i++){
			array[i] *= scalar;
		}
	}
	
	/**
	* Computes the dot product of two vectors (arrays) of the same length. 
	* If the length of the two arrays is not the same, then returns NaN.
	*/
	public static float dotProduct(float[] arrayA, float[] arrayB){
		float product = 0;
		if(arrayA.length == arrayB.length){
			for(int i=0; i<arrayA.length; i++){
				product += arrayA[i]*arrayB[i];
			}
		}
		else{
			product = Float.NaN;
		}
		return product;
	}
	
	/**
	* Computes the magnitude (length) of a vector (array).
	*/
	public static float magnitude(float[] array){
		float sumSquares = 0;
		for(int i=0; i<array.length; i++){
			sumSquares += array[i]*array[i];
		}
		return (float)Math.sqrt(sumSquares);
	}	
}