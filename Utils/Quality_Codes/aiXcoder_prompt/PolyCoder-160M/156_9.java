import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			int[] c = new int[arrayA.length + arrayB.length];
			System.arraycopy(arrayA, 0, c, 0, arrayA.length);
			System.arraycopy(arrayB, 0, c, arrayA.length, arrayB.length);
			arrayA = c;
			arrayB = c;
	}

	/** The next random set of points */
	public static List<int[]> getPoints(){
			IntList tmpList = new IntArrayList(3);

}
}