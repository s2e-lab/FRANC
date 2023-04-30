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
				return null;
			}
			final Integer[] result = new Integer[array.length];
			for(int i = 0; i < array.length; i++){
				result[i] = Integer.valueOf(array[i]);
			}
			return result;
		}
	
	/** 
	 * <p>Converts an array of objects of type <code>Integer</code> to primitive ints.</p> <p>This method returns <code>null</code> for a <code>null</code> input array.</p>
	 * @param array  an <code>Integer</code> array
	 * @return an <code>int</code> array, <code>null</code> if null array input
	 */
	 
	 public static int[] toPrimitive(final Integer[] array){
			if(array == null){
				return null;
			}
			final int[] result = new int[array.length];
			for(int i = 0; i < array.length; i++){
				result[i] = array[i].intValue();
			}
			return result;
		}
		
	/** 
	 * <p>Sorts an array of objects of type <code>Comparable</code>.</p> <p>This method returns <code>null</code> for a <code>null</code> input array.</p>
	 * @param array  a <code>Comparable</code> array
	 * @return a sorted <code>Comparable</code> array, <code>null</code> if null array input
	 */
	
	public static <T extends Comparable<T>> T[] sort(final T[] array){
			if(array == null){
				return null;
			}
			Arrays.sort(array);
			return array;
		}
		
	/** 
	 * <p>Sorts an array of objects of type <code>Object</code> based on a user-defined <code>Comparator</code>.</p> <p>This method returns <code>null</code> for a <code>null</code> input array or <code>null</code> comparator.</p>
	 * @param array  an <code>Object</code> array
	 * @param comparator  a <code>Comparator</code> to define sorting order
	 * @return a sorted <code>Object</code> array based on the user-defined <code>Comparator</code>, <code>null</code> if null array input or null comparator
	 */
	

}