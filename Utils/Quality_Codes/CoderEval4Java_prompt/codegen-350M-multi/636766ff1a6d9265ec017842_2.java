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
		if(array==null || array.length==0) return null;
		
		final double[] joinedArray = new double[array.length];
		final int rightIndex = array.length-1;
		int index = 0;
		while(index<array.length){
			
			joinedArray[index] = array[rightIndex];
			
			index = rightIndex;
			rightIndex -= 1;
		}
		return joinedArray;
	}
}
