import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID131{
	/**
	* Produces a new double array containing the elements between the start and end indices. The start index is inclusive, the end index exclusive. Null array input produces null output.
	*/
	public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive){
			assert (array!= null);
			assert (startIndexInclusive >= 0);
			assert (startIndexInclusive <= array.length);
			assert (endIndexExclusive >= 0);
			assert (endIndexExclusive <= array.length);

			double[] result = new double[endIndexExclusive - startIndexInclusive + 1];
			System.arraycopy(array, startIndexInclusive, result, 0, endIndexExclusive - startIndexInclusive);
			System.arraycopy(array, 0, result, endIndexExclusive - startIndexInclusive, array.length);
			return result;
	}
}