import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ArrayUtils{
	/** 
	 * <p>Converts an array of object Doubles to primitives.</p> <p>This method returns <code>null</code> for a <code>null</code> input array.</p>
	 * @param array  a <code>Double</code> array, may be <code>null</code>
	 * @return a <code>double</code> array, <code>null</code> if null array input
	 * @throws NullPointerException if array content is <code>null</code>
	 */
	
	public static double[] toPrimitive(final Double[] array){
		if (array == null) return null;
		final int dimension = array.length;
		final boolean isSorted = (dimension > 1);
		
		if(dimension == 0){
			final double[] result = new double[0];
			return result;
		}

		final double[] output = new double[dimension];
		 
		for (int i=0; i < dimension; i++) {
			output[i] = array[i];
		}
		
		if (isSorted) sort(output, 0, dimension - 1);

}
}