import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID131{
	/**
	* Produces a new double array containing the elements between the start and end indices. The start index is inclusive, the end index exclusive. Null array input produces null output.
	*/
	public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive){
		 if (array.length == 0)
			 return new double[0];
		if (array.length == 1){
			double[] oneElement = new double[1];
			oneElement[0] = array[0];
			return oneElement;
		}
		if (startIndexExclusive < 0)
			startIndex_ = Math.addExact(startIndexExclusive, 0);
		else if (startIndexExclusive > endIndexExclusive)
			startIndex_ = startIndexExclusive - (endIndexExclusive-startIndexExclusive);
}
}