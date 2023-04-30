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
			if(array == null){
				return null; //return null if input array is null
			}
			
			final int length = array.length;
			final Integer[] result = new Integer[length]; // create the result Integer array
			
			for(int i=0; i<length; i++){
				result[i] = Integer.valueOf(array[i]); // iterate through the input array and convert each int to an Integer object
			}
			return result; //return the Integer array
	}
}