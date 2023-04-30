import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		for(int i=0;i!=arrayB.length;i++){
			if(arrayA[i]==0){
				arrayB[i]=0;
			}
		}
	}
}
/**
 This functions returns the maximum sum of two vectors. The result can be written as an elementary sum: x1+x2+...+x(x2+x3) = x(x1+x2+...+x(x2+x3).
*/