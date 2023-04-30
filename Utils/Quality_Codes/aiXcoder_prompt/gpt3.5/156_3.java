import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			for (int i = 0; i < arrayA.length; i++){
				if (i < arrayB.length){
				arrayA[i] += arrayB[i];
				}
			}
		}
		
	/**
	* Subtracts a given vector (array) from another one. * Every element of the second array (missing element is treated to be zero) is subtracted from the corresponding element (if not missing) of the first array.
	*/
	public static void subtractFrom(float[] arrayA, float[] arrayB){
		for (int i = 0; i < arrayA.length; i++){
			if (i < arrayB.length){
				arrayA[i] -= arrayB[i];
			}
		}
	}
	
	/**
	* Multiplies a given scalar value to a vector (array).
	*/
	public static void multiply(float scalar, float[] vector){
		for (int i = 0; i < vector.length; i++){
			vector[i] *= scalar;
		}
	}
	
	/**
	* Computes the dot product of two vectors (arrays).
	*/
	public static float dotProduct(float[] arrayA, float[] arrayB){
		float result = 0;
		for (int i = 0; i < arrayA.length; i++){
			if (i < arrayB.length){
				result += arrayA[i] * arrayB[i];
			}
		}
		return result;
	}
	
	/**
	* Computes the Euclidean Distance between two vectors (arrays).
	*/
	public static float euclideanDistance(float[] arrayA, float[] arrayB){
		float result = 0;
		for (int i = 0; i < arrayA.length; i++){
			if (i < arrayB.length){
				result += (arrayA[i] - arrayB[i]) * (arrayA[i] - arrayB[i]);
			} else {
				result += arrayA[i] * arrayA[i];
			}
		}
		return (float)Math.sqrt(result);
	}
}