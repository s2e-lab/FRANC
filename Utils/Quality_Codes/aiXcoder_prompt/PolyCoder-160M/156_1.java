import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			checkForNaN(arrayA, 1.0e-16);
			int Ni = arrayA.length;
			for(int i = 0; i<Ni; i++){
				float v = arrayA[i]-arrayB[i];
				valueAdd(v);
			}
	}

	/**
	* Adds a given vector (number of array elements) to another one assuming single element and double element. * Every element of the second array (missing element is treated to be zero) must be add to the corresponding element.
	*/
}