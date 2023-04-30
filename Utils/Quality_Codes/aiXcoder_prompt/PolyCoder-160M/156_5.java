import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
		 
		
			int i = arrayA.length-1;	
		
			float[] tmp = new float[i];		
			
			
			for(i--;i >= 0;i--){
				tmp[i] += arrayB[i] + arrayA[i];
			}
				
			tmp[i] = tmp[i] + arrayA[i];		
			arrayA = tmp;
}
}