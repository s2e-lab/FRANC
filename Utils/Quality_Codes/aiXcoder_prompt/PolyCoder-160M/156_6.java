import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			System.arraycopy(arrayA, 0, arrayA, 0, arrayA.length);
			System.arraycopy(arrayB, 0, arrayB, 0, arrayB.length);
			for (int i= arrayA.length-1; i>0; i--) {arrayA[i]=arrayB[i];}
}

	


	public static void main(String[] args){
			Object i10=new Vector3i();
			Vector3i a10=new Vector3i(10,10,10);
}
}