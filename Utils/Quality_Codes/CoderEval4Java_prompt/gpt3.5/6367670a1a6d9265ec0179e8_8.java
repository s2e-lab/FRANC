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
			if(array == null || array.length == 0){
			return new Boolean[0];
		}
		
		return array;
	}
	
	/** 
	 * <p>Returns an array of <code>Boolean</code> objects initialized to the specified values.</p>
	 * @param values  the values to initialize the array with
	 * @return an array of <code>Boolean</code> objects initialized to the specified values
	 * @since 2.5
	 */
	public static Boolean[] toObject(final boolean... values){
		if(values == null){
			return null;
		} else if(values.length == 0){
			return new Boolean[0];
		}
		
		final Boolean[] result = new Boolean[values.length];
		for(int i = 0; i < values.length; i++){
			result[i] = Boolean.valueOf(values[i]);
		}
		
		return result;
	}
	
	/** 
	 * <p>Converts an array of object Booleans to primitives.</p>
	 * <p>This method returns <code>null</code> for a <code>null</code> input array.</p>
	 * @param array  the array of object Booleans to convert
	 * @return an array of primitive booleans representing the input, <code>null</code> if null input
	 * @throws NullPointerException if array content used as primitive is <code>null</code>
	 * @since 2.2
	 */
	public static boolean[] toPrimitive(final Boolean[] array){
		if(array == null){
			return null;
		} else if(array.length == 0){
			return new boolean[0];
		}
		
		final boolean[] result = new boolean[array.length];
		for(int i = 0; i < array.length; i++){
			// NullPointerException is thrown when null is used as a primitive type
			result[i] = array[i].booleanValue();
		}
		
		return result;
	} 
}  // end of ArrayUtils class