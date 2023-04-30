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
		for(int i = 0; i < length; i++){
			objArray[i] = Integer.valueOf(array[i]);
		}
		return objArray;
	}
	
	/**
	 * <p>Converts an array of objects to primitive ints.</p> <p>This method returns <code>null</code> for a <code>null</code> input array.</p> <p>If any element is <code>null</code>, a <code>NullPointerException</code> is thrown.</p>
	 * @param array  an <code>Integer</code> array
	 * @return an <code>int</code> array, <code>null</code> if null array input
	 * @throws NullPointerException  if an element in the array is <code>null</code>
	 */
	public static int[] toPrimitive(final Integer[] array){
		if(array == null){
			return null;
		}
		final int length = array.length;
		final int[] intArray = new int[length];
		for(int i = 0; i < length; i++){
			intArray[i] = array[i].intValue();
		}
		return intArray;
	}
	
	/**
	 * <p>Reverses an array of primitive ints.</p> 
	 * @param array  an <code>int</code> array
	 */
	public static void reverse(final int[] array){
		if(array == null){
			return;
		}
		final int length = array.length;
		final int endIndex = length - 1;
		for(int i = 0, mid = length >> 1; i < mid; i++){
			final int temp = array[i];
			array[i] = array[endIndex - i];
			array[endIndex - i] = temp;
		}
	}
	
	/**
	 * <p>Reverses an array of objects.</p> <p>This method returns <code>null</code> for a <code>null</code> input array.</p>
	 * @param array  an <code>Object</code> array
	 */
	public static void reverse(final Object[] array){
		if(array == null){
			return;
		}
		final int length = array.length;
		final int endIndex = length - 1;
}
}