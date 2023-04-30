import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			int lengthA = arrayA.length;
		int lengthB = arrayB.length;
		int maxLength = Math.max(lengthA, lengthB);

		for (int i = 0; i < maxLength; i++) {
			if (i < lengthA && i < lengthB) {
				arrayA[i] += arrayB[i];
			} else if (i >= lengthA && i < lengthB) {
				arrayA[i] = arrayB[i];
			}
			//missing elements in arrayB are not added
		}
	}
}