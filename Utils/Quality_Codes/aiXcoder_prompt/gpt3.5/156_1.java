import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			for(int i=0; i<arrayA.length && i<arrayB.length; i++){
			arrayA[i] += arrayB[i];
		}
	}
	
	/** 
	* Computes the dot product between two vectors (arrays).
	* The dot product is computed by multiplying together the element-wise products of the two vectors (arrays) and computing their sum.
	*/
	public static float dotProduct(float[] arrayA, float[] arrayB){
		float dotProduct = 0.0f;
		for(int i=0; i<arrayA.length && i<arrayB.length; i++){
			dotProduct += arrayA[i]*arrayB[i];
		}
		return dotProduct;
	}
	
	/**
	* Computes the magnitude of a given vector (array).
	* The magnitude is computed by taking the square root of the sum of the squares of the elements of the vector (array).
	*/
	public static float magnitude(float[] array){
		float sumOfSquares = 0.0f;
		for(int i=0; i<array.length; i++){
			sumOfSquares += array[i]*array[i];
		}
		float magnitude = (float) Math.sqrt(sumOfSquares);
		return magnitude;
	}
	
	/**
	* Computes the cosine similarity between two vectors (arrays).
	* The cosine similarity is computed by dividing the dot product of the two vectors by the product of their magnitudes.
	*/
	public static float cosineSimilarity(float[] arrayA, float[] arrayB){
		float dotProduct = dotProduct(arrayA, arrayB);
		float magnitudeA = magnitude(arrayA);
		float magnitudeB = magnitude(arrayB);
		if(magnitudeA == 0 || magnitudeB == 0){ // if either vector has zero magnitude, the similarity is 0
			return 0;
		}
		float cosineSimilarity = dotProduct / (magnitudeA * magnitudeB);
		return cosineSimilarity;
	}
	
	public static void main(String[] args){
		// Sample usage
		float[] a = {1.0f, 2.0f, 3.0f};
		float[] b = {4.0f, 5.0f, 6.0f, 7.0f};
		addTo(a, b);
		System.out.println(Arrays.toString(a));
		
}
}