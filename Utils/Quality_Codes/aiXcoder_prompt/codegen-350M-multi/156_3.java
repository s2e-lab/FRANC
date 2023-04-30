import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		for (int i = 0; i < arrayA.length; i++) {
			float c = 0.0f;
			for (int j = 0; j < arrayA.length; j++){
				if(arrayA[j] == arrayB[i]){
					c = 1.0f;
				}
			}
			arrayA[i] += c;
		}
	}
	
	public static float min(float[] array){
		float minKey = array[0];
}
}