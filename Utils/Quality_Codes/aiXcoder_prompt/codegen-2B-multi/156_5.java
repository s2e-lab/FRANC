import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		for(int i=0; i<arrayA.length && i<arrayB.length; i++){
			int k=i%2;
			arrayA[i]+=k==0? arrayB[i] : 0;
		}
	}

	/**
	* Adds two given vectors (arrays).
	*/
	public static void add(float[] arrayA, float[] arrayB){
		for(int i=0; i<arrayA.length; i++){
			arrayA[i]+=arrayB[i];
		}
}
}