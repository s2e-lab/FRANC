import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			for(int i=0;i<Math.min(arrayA.length, arrayB.length);i++){
			arrayA[i] += arrayB[i];
		}
	}
	
	/**
	* Multiplies every element of the given vector by a given scalar.
	*/
	public static void multiplyByScalar(float[] array, float scalar){
		for(int i=0;i<array.length;i++){
			array[i] *= scalar;
		}
	}
	
	/**
	* Calculates the dot product of two given vectors.
	*/
	public static float dotProduct(float[] arrayA, float[] arrayB){
		float result = 0;
		for(int i=0;i<Math.min(arrayA.length, arrayB.length);i++){
			result += arrayA[i] * arrayB[i];
		}
		return result;
	}
	
	/**
	* Normalizes the given vector.
	*/
	public static void normalize(float[] array){
		float sumOfSquares = 0;
		for(int i=0;i<array.length;i++){
			sumOfSquares += array[i] * array[i];
		}
		
		float magnitude = (float) Math.sqrt(sumOfSquares);
		if(magnitude == 0){
			return;
		}
		
		for(int i=0;i<array.length;i++){
			array[i] /= magnitude;
		}
	}
	
	public static void main(String[] args){
		//Test cases
		
		//Adding two equal length arrays
		float[] a = {1,2,3};
		float[] b = {4,5,6};
		addTo(a,b); //a should now be {5,7,9}
		
		//Multiplying an array by a scalar
		float[] c = {2,-4,6};
		float scalar = -3;
		multiplyByScalar(c, scalar); //c should now be {-6,12,-18}
		
		//Calculating the dot product of two arrays
		float[] d = {1,2,3,4};
		float[] e = {5,6,7};
		float dotProductResult = dotProduct(d,e); //dotProductResult should be 5*1 + 6*2 + 7*3 = 38
		
		//Normalizing an array
		float[] f = {1,2,3,4,5};
		normalize(f); //f should now be {0.
}
}