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
		if(array == null){
			return null;
		}
		short length = array.length;
		if(length == 0) {
			return new double[0];
		}
		double[] result = new double[length];
		for(int i = 0; i < length; i++) {
			Double primitive = array[i];
			Double d = toPrimitive(primitive);
			result[i] = d;
		}
		return result;
	}
	
	public static byte[] toPrimitive(final double[] array){
}
}