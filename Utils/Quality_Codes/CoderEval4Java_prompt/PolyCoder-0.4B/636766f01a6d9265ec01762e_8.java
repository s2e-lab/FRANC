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
			if (array == null || array.length < 2 || array[0] == null || array[1] == null){
				return true;
			}
			else {
				return Double.doubleToLongBits(FastMath.abs(array[0]) + FastMath.abs(array[1])) <= 1L;
			}
	}
}