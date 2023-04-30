import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID131{
	/**
	* Produces a new double array containing the elements between the start and end indices. The start index is inclusive, the end index exclusive. Null array input produces null output.
	*/
	public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive){
			if(array==null){
				return null;
			}
			if((array.length < startIndexExclusive) || (array.length > endIndexExclusive)){
				throw new IllegalArgumentException("Array size must be equal or smaller than the capacity.");
			}
			if(array.length > endIndexExclusive - startIndexInclusive + 1){
				return DoubleConverter.doubleArrayToDoubleArray(array, startIndexInclusive, startIndexExclusive, endIndexExclusive-startIndexInclusive);
			}
}
}