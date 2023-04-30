import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID131{
	/**
	* Produces a new double array containing the elements between the start and end indices. The start index is inclusive, the end index exclusive. Null array input produces null output.
	*/
	public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive){
		 if ((array == null) || (array.length < startIndexInclusive) || (array.length > endIndexExclusive)){
			 return null;
		 }
		 return array.subarray(startIndexInclusive, endIndexExclusive);
	}
	
	public static int getDimension(final ID31_1 me){
		return 3;
	}
}