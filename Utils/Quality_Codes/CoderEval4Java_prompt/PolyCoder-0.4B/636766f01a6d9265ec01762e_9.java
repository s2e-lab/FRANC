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
		 Boolean isNull = null;
		int length = array.length;
		for(int counter =length-1;counter>=0;counter--){
		    if(!isNull.booleanValue() && array[counter]!= 0d) {
		        isNull = Boolean.FALSE;
		    }
		}
		
		return isNull == null;
	}
	
}