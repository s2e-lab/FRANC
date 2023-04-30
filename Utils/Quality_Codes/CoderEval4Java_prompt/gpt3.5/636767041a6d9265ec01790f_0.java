import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ArrayUtils{
	/** 
	 * <p>Converts an array of primitive ints to objects.</p> <p>This method returns <code>null</code> for a <code>null</code> input array.</p>
	 * @param array  an <code>int</code> array
	 * @return an <code>Integer</code> array, <code>null</code> if null array input
	 */
	
	public static Integer[] toObject(final int[] array){
			if (array == null) {
			return null;
		}
		final Integer[] result = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = Integer.valueOf(array[i]);
		}
		return result;
	}
} 

/**
 * The main method for testing ArrayUtils.toObject(int[] array)
 */