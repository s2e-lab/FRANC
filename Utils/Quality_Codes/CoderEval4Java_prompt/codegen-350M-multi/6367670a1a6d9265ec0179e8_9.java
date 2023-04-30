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
		if(array==null || array.length == 0){
			return new Boolean[0];
		}
		return array;
	}
	  
      /**
	 * <p>Null safe method to convert two type arrays to an integer array.</p>
	 * @param array  one array of type Boolean
	 * @param fromArray the other array of type Boolean
	 * @return a new type array
	 */
	public static Boolean[] nullToArray(final Boolean[] array, final Boolean[] fromArray){
		final int len1 = fromArray.length;
}
}