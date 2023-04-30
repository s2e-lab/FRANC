import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			if (arrayA.length != arrayB.length) {
			System.out.println("Vectors are not of equal length.");
			return;
		}
		for (int i = 0; i < arrayA.length; i++) {
			if (Float.isNaN(arrayB[i])) {
				// skip adding NaN values
				continue;
			}
			arrayA[i] += arrayB[i];
		}
	}
	
	public static void main(String[] args) {
		float[] vectorA = {1.5f, 2.0f, 3.5f, Float.NaN, 5.0f};
		float[] vectorB = {1.0f, 2.5f, Float.NaN, 4.0f, 5.5f};
		addTo(vectorA, vectorB);
		// print the result
		System.out.println(Arrays.toString(vectorA));
	}
}