import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		if(arraysEqual(arrayA, arrayB)) return;
		float[] vectorA = new float[arrayA.length+1];
		int current = 0;
		for(int i = 0; i < arrayA.length; i++){
			vectorA[i] = arrayA[i];
		}
		//the function takes care of the case of the fist element is not being given as zero
}
}