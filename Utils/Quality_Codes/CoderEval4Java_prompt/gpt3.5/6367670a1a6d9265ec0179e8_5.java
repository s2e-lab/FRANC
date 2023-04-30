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
			if (array == null || array.length == 0) {
	            return new Boolean[0]; //returning empty Boolean array
	        } else {
	            return array;
	        }
	}
	
	/**
	 * <p>Get a random element from the specified array.</p>
	 * @param array  the array to get a random element from, must not be empty or <code>null</code>
	 * @return a random element from the array
	 * @throws IllegalArgumentException if array is empty or <code>null</code>
	 */
	public static <T> T getRandomElement(T[] array) {
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("The array must not be empty or null");
		}
		Random random = new Random(); //Creating a new instance of Random class
		int randomIndex = random.nextInt(array.length); //Generating random integer index
		return array[randomIndex]; //returning random element from the array
	}
	
	/**
	 * <p>Get a subarray of the specified array from start index to end index (inclusive).</p>
	 * @param array  the array to get a subarray from, must not be empty or <code>null</code>
	 * @param startIndex  the starting index, inclusive
	 * @param endIndex  the ending index, inclusive
	 * @return a subarray of the specified array from start index to end index (inclusive)
	 * @throws IllegalArgumentException if array is empty, <code>null</code>, or if the start or end index is out of bounds
	 */
	public static <T> T[] getSubArray(T[] array, int startIndex, int endIndex) {
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("The array must not be empty or null");
		}
		if (startIndex < 0 || endIndex > array.length - 1 || startIndex > endIndex) {
			throw new IllegalArgumentException("The start and end index must be within the bounds of the array");
		}
		return Arrays.copyOfRange(array, startIndex, endIndex + 1); //returning subarray using Arrays.copyOfRange method
	}
}