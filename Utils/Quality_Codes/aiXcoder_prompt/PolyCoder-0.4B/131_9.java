import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID131{
	/**
	* Produces a new double array containing the elements between the start and end indices. The start index is inclusive, the end index exclusive. Null array input produces null output.
	*/
	public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive){
			return new double[]{(double) array[startIndexInclusive], (double) array[endIndexExclusive]};
	}

	/**
	* Produces a new double array containing the elements from the start indices. The start index is inclusive, the end index exclusive. Null array input produces null output.
	*/
	public static double[] subarray(final double[] array, int startStartIndexInclusive, int endIndexExclusive){
		return new double[]{(double) array[startStartIndexInclusive] - array[startIndexInclusive]};
	}


}