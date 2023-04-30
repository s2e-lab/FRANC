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


			float sum = 0f;
			int sumA = 0;
			int sumB = 0;

			for (int i = 0; ++i < lengthA;) {
				sum = sum + arrayA[i];
				sumA = sum;
				sum = sum - arrayB[i];
			}

}
}