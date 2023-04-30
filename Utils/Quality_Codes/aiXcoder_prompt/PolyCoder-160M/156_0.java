import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			if (N == 1){
				int N1a = arrayA.length;
				int N1b = arrayB.length;
				for (int aIndex=0; aIndex<N1a; aIndex++){
					int j = arrayA[aIndex];
					for (int bIndex=0; bIndex<N1b; bIndex++){
						int c = arrayA[bIndex];
						arrayA[bIndex] = arrayB[aIndex];
						arrayB[aIndex] = arrayA[