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

			final int length = array.length;
			final Integer[] objArray = new Integer[length];
			for(int i=0;i<length;i++){
				objArray[i] = Integer.valueOf(array[i]);
			}

			return objArray;
	}

	/** 
	 * <p>Converts an array of objects to primitive ints.</p> <p>This method returns <code>null</code> for a <code>null</code> input array.</p> <p>If any object in the array is <code>null</code>, a <code>NullPointerException</code> is thrown.</p>
	 * @param array  an <code>Integer</code> array
	 * @return an <code>int</code> array, <code>null</code> if null array input
	 * @throws NullPointerException if an element is <code>null</code>
	 */
	public static int[] toPrimitive(final Integer[] array){
			if(array == null){
				return null;
			}

			final int length = array.length;
			final int[] intArray = new int[length];
			for(int i=0;i<length;i++){
				intArray[i] = array[i].intValue();
			}

			return intArray;
	}

	/** 
	 * <p>Joins an array of <code>String</code> objects.</p> <p>This method returns <code>null</code> for a null input array.</p>
	 * @param array  an array of <code>String</code> objects
	 * @param separator  the separator to use between the <code>String</code> objects
	 * @return the joined <code>String</code>, <code>null</code> if null array input
	 */
	public static String join(final String[] array, final String separator){
			if(array == null){
				return null;
			}

			final int length = array.length;
			if(length == 0){
				return "";
			}

			final StringBuilder builder = new StringBuilder();
			builder.append(array[0]);

			for(int i=1;i<length;i++){
				builder.append(separator);
				builder.append(array[i]);
			}

			return builder.toString();
	}
}
