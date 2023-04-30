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
			// Here's the completed method for your reference

		if (array == null || array.length == 0) {
			return new Boolean[0];
		} else {
			return array;
		}
	}

	public static Byte[] nullToEmpty(final Byte[] array){
		if (array == null || array.length == 0) {
			return new Byte[0];
		} else {
			return array;
		}
	}

	public static Character[] nullToEmpty(final Character[] array){
		if (array == null || array.length == 0) {
			return new Character[0];
		} else {
			return array;
		}
	}

	public static Double[] nullToEmpty(final Double[] array){
		if (array == null || array.length == 0) {
			return new Double[0];
		} else {
			return array;
		}
	}

	public static Float[] nullToEmpty(final Float[] array){
		if (array == null || array.length == 0) {
			return new Float[0];
		} else {
			return array;
		}
	}

	public static Integer[] nullToEmpty(final Integer[] array){
		if (array == null || array.length == 0) {
			return new Integer[0];
		} else {
			return array;
		}
	}

	public static Long[] nullToEmpty(final Long[] array){
		if (array == null || array.length == 0) {
			return new Long[0];
		} else {
			return array;
		}
	}

	public static Short[] nullToEmpty(final Short[] array){
		if (array == null || array.length == 0) {
			return new Short[0];
		} else {
			return array;
		}
	}
}

// The code above creates a utility class named ArrayUtils that contains a method to change a null reference to an empty one. The method is implemented for each of the Java array types (Boolean[], Byte[], Character[], Double[], Float[], Integer[], Long[], and Short[]).