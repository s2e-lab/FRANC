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
		final int size = array.length;
		final double[] primitives = new double[size];
		for (int i=0; i<size; i++){
			final Double element = array[i];
			primitives[i] = (element == null)? Double.NaN : element.doubleValue();
		}
		return primitives;
	}
}
