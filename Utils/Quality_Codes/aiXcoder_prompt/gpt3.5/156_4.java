import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			if(arrayA.length != arrayB.length){
				// throw an IllegalArgumentException if the arrays are of unequal length
				throw new IllegalArgumentException("Arrays must be of equal length.");
			}

			// iterate through the arrays and perform the addition
			for(int i=0; i<arrayA.length; i++){
				if(!Float.isNaN(arrayB[i])){
					// if the element in arrayB is not NaN, add it to the corresponding element in arrayA
					arrayA[i] += arrayB[i];
				}
			}
		}
		
	/**
	* Calculates the dot product of two given vectors (arrays). 
	*/
	public static float dotProduct(float[] arrayA, float[] arrayB){
		if(arrayA.length != arrayB.length){
			// throw an IllegalArgumentException if the arrays are of unequal length
			throw new IllegalArgumentException("Arrays must be of equal length.");
		}

		float product = 0;

		// iterate through the arrays and calculate the product of corresponding elements
		for(int i=0; i<arrayA.length; i++){
			if(!Float.isNaN(arrayA[i]) && !Float.isNaN(arrayB[i])){
				// if both elements are not NaN, multiply them and add the result to the product
				product += arrayA[i]*arrayB[i];
			}
		}

		return product;
	}

	/**
	* Calculates the euclidean norm (magnitude) of a given vector (array).
	*/
	public static float magnitude(float[] array){
		float sum = 0;

		// iterate through the array and calculate the sum of squares of elements
		for(int i=0; i<array.length; i++){
			if(!Float.isNaN(array[i])){
				sum += array[i]*array[i];
			}
		}

		// calculate the square root of the sum and return it as the magnitude
		return (float)Math.sqrt(sum);
	}

	/**
	* Calculates the cosine similarity of two given vectors (arrays).
	*/
	public static float cosineSimilarity(float[] arrayA, float[] arrayB){
		// calculate the dot product and magnitude of the vectors
		float dotProduct = dotProduct(arrayA, arrayB);
		float magnitudeA = magnitude(arrayA);
		float magnitudeB = magnitude(arrayB);

		// if either magnitude is zero, return zero to avoid division by zero error
}
}