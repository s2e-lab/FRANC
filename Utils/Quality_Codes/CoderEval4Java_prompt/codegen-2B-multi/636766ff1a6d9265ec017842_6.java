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
		if (array == null) { return null; }
		final double[] retval = new double[array.length];
		int i = 0;
		for (Double d : array){
			retval[i++] = d.doubleValue();
		}
		return retval;
	}
	
	public static void sort(final Double[] array1, final Double[] array2){
	    final int size = array1.length;
}
}