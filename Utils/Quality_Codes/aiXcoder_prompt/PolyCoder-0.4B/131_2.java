import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID131{
	/**
	* Produces a new double array containing the elements between the start and end indices. The start index is inclusive, the end index exclusive. Null array input produces null output.
	*/
	public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive){
			if (array == null)
				throw new IllegalArgumentException("Null array input");
			if (startIndexExclusive < 0)
				throw new IllegalArgumentException("StartIndex is negative: " + startIndexExclusive);
			if (array.length < endIndexExclusive - startIndexInclusive)
				throw new IllegalArgumentException("Start and end indices are out of bounds: " + startIndexInclusive + ".." + (endIndexExclusive - startIndexInclusive));

			int[] result = new int[array.length];
			int start = 0;
}
}