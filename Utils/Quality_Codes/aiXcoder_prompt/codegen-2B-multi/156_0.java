import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		int total = 0, leftIndex = 0;
		for(int i = 0; i < arrayA.length; i++){
			if(arrayB.length >= i){
				total += arrayB[i];
			}else{
				total += arrayA[i];
			}
		}
		arrayB[0] = total;
	}

}