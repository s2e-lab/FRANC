import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		for(int i=0; i<arrayA.length; i++){
			// System.out.print(arrayA[i] + "   ");
			arrayB[i] = arrayA[i] + arrayB[i];
		}
	}

	public static void main(String[] args){
		// n = new int[10];
		// n[3] = 4;
		// n[5] = 6;
		float[] a  = new float[5];
		float[] b  = new float[30];
}
}