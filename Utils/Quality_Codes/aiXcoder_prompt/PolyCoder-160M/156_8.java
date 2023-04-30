import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			/*
			 * This is the inverse of addVector();
			 * It can take advantage of fact that it is less than Math.min(0,arrayA.length-arrayB.length) for a real input.
			 *
			 * The only difference is that this is just an optimised method that always returns a positive result regardless of whether or not
			 * the input is negative, i.e. -1.0 means -1 and 0.0 means zero.
			 */
				float value = (float)arrayA.length;
}
}