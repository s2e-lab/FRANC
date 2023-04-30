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
		 return (!ArrayUtils.isEmpty(array));
	}

	/**
	 * <p>Checks if an array of primitive doubles is empty or contain <code>null</code>.</p>
	 * @param array  the array to test
	 * @return <code>true</code> if the array is empty or contains <code>null</code>
	 */
	public static boolean isNotEmpty(final double[] array){
		
			if(isEmpty(array)){
				return true;
			}
			
}
}