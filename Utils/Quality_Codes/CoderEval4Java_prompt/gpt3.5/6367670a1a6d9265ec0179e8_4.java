import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ArrayUtils{
	/** 
	 * <p>Defensive programming technique to change a <code>null</code> reference to an empty one.</p> <p>This method returns an empty array for a <code>null</code> input array.</p> <p>As a memory optimizing technique an empty array passed in will be overridden with the empty <code>public static</code> references in this class.</p>
	 * @param array  the array to check for <code>null</code> or empty
	 * @return the same array, <code>public static</code> empty array if <code>null</code> or empty input
	 * @since 2.5
	 */
	
	public static Boolean[] nullToEmpty(final Boolean[] array){
			if (array == null || array.length == 0){
		return new Boolean[0];
	}
	else {
		return array;
	}
}
/** 
 * <p>Returns the sum of all the elements in the specified array of integers.</p>
 * @param array  the array of integers to sum
 * @return the sum of all the elements in the specified array of integers
 * @throws IllegalArgumentException if the input array is <code>null</code>
 * @since 2.5
 */
public static int sum(final int[] array){
	if (array == null){
		throw new IllegalArgumentException("Input array can't be null");
	}
	int sum = 0;
	for (int i=0; i<array.length; i++){
		sum += array[i];
	}
	return sum;
}
}