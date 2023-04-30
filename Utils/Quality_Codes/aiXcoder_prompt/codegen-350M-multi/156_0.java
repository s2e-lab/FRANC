import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		for(int i=0;i<arrayA.length;i++){
			arrayA[i]=arrayA[i]+(arrayB[i]==0? 0 : 1);
		}
	}
	/**
	* Divides a given vector (array) by two, except of the first element. The second element of the original array remains unchanged.
	*/
	public static float div(float arrayA[]){
		return arrayA[0] / arrayA[1];
	}
}