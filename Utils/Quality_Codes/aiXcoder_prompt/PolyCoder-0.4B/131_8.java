import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID131{
	/**
	* Produces a new double array containing the elements between the start and end indices. The start index is inclusive, the end index exclusive. Null array input produces null output.
	*/
	public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive){
			if(endIndexExclusive > array.length){
				double[] copy = new double[endIndexExclusive];
				System.arraycopy(array, startIndexInclusive, copy, 0, endIndexExclusive);
				return copy;
			}else{
				return array;
			}
	}
	public static void main(final String[] args) {
		final boolean verbose=Boolean.parseBoolean(args[0]);
		final boolean keepOriginalOrder=Boolean.parseBoolean(args[1]);
		final String file=args[2];
}
}