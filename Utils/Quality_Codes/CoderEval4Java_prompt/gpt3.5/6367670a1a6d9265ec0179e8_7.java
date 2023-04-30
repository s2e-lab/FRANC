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
			if (array == null) {
            return new Boolean[0];
        } else {
            return array;
        }
    }
    
    public static Integer[] nullToEmpty(final Integer[] array){
        if (array == null) {
            return new Integer[0];
        } else {
            return array;
        }
    }
    
    public static Double[] nullToEmpty(final Double[] array){
        if (array == null) {
            return new Double[0];
        } else {
            return array;
        }
    }
    
    public static String[] nullToEmpty(final String[] array){
        if (array == null) {
            return new String[0];
        } else {
            return array;
        }
    }
    
    public static Object[] nullToEmpty(final Object[] array){
        if (array == null) {
            return new Object[0];
        } else {
            return array;
        }
    }
}