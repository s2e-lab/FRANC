import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			for(int i=0; i<arrayA.length; i++){
			if(i<arrayB.length){
				arrayA[i] += arrayB[i];
			}
		}
	}
	
	/**
	* Calculates the dot product of two given vectors (arrays).
	* The dot product of two vectors is the sum of the products of their corresponding components.
	*/
	public static float dotProduct(float[] arrayA, float[] arrayB){
		float result = 0;
		for(int i=0; i<arrayA.length; i++){
			if(i<arrayB.length){
				result += arrayA[i] * arrayB[i];
			}
		}
		return result;
	}
	
	/**
	* Calculates the Euclidean distance between two given vectors (arrays).
	* The Euclidean distance between two vectors is the square root of the sum of the squares of their corresponding components.
	*/
	public static float euclideanDistance(float[] arrayA, float[] arrayB){
		float result = 0;
		for(int i=0; i<arrayA.length; i++){
			if(i<arrayB.length){
				result += Math.pow((arrayA[i] - arrayB[i]), 2);
			}else{
				result += Math.pow(arrayA[i], 2);
			}
		}
		return (float)Math.sqrt(result);
	}
	
	/**
	* Traverses a given matrix and returns its transposed matrix.
	* The transposed matrix of a matrix is formed by interchanging its rows and columns.
	*/
	public static float[][] transpose(float[][] matrix){
		int rows = matrix.length;
		int cols = matrix[0].length;
		float[][] result = new float[cols][rows];
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				result[j][i] = matrix[i][j];
			}
		}
		return result;
	}
}