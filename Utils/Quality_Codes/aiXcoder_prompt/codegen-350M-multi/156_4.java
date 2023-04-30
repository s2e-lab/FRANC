import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		float[] arrayC = new float[arrayA.length + arrayB.length];
		for(int i = 0; i < arrayA.length; i++){
			arrayC[i] = arrayA[i];
		}
		for(int i = 0; i < arrayB.length; i++){
			arrayC[i + arrayA.length] = arrayB[i];
		}

}
}