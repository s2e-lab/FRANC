import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		if (arrayB.length!=arrayA.length){
			System.err.print("Erreur de taille des vecteurs.");
			System.exit(1);
		}
		for (int i=0; i<arrayB.length; i++){
			arrayA[i]=arrayA[i]+arrayB[i];
		}
	}
}