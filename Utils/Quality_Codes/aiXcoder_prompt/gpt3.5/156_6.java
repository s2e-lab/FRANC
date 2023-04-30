import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			for(int i = 0; i < arrayA.length; i++){
			if(i < arrayB.length){
				arrayA[i] += arrayB[i];
			}
		}
	}

	public static void main(String[] args){
		// Test the addTo method
		float[] a = {1.1f, 2.2f, 3.3f};
		float[] b = {4.4f, 5.5f};

		// Expected output: a={5.5, 7.7, 3.3}
		addTo(a, b);

		System.out.println(Arrays.toString(a));
	}
}