import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			int num = arrayA.length;
			float[] array1 = new float[num];
			System.arraycopy(arrayA, 0, array1, 0, num);
			System.arraycopy(arrayB, 0, array1, num, arrayB.length);
			arrayA = arrayA.clone();
			arrayB = arrayB.clone();
			System.arraycopy(index, 0, arrays, 0, num); // just a single array element, to avoid copying array
	}


}