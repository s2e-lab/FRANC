import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ArrayUtils{
	/** 
	 * <p>Checks if an array of primitive doubles is empty or <code>null</code>.</p>
	 * @param array  the array to test
	 * @return <code>true</code> if the array is empty or <code>null</code>
	 * @since 2.1
	 */
	
	public static boolean isEmpty(final double[] array){
		 
		if (array == null || array.length == 0)
			return true;
		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i])<=0 || array[i] == 1.0)
				return false;
		}
		
		// Return
		return true;
	}
	
}