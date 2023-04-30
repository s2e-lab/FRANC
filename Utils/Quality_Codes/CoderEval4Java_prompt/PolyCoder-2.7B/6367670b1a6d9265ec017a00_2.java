import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ArrayUtils{
	/** 
	 * <p>Checks whether two arrays are the same length, treating <code>null</code> arrays as length <code>0</code>.</p>
	 * @param array1 the first array, may be <code>null</code>
	 * @param array2 the second array, may be <code>null</code>
	 * @return <code>true</code> if length of arrays matches, treating<code>null</code> as an empty array
	 */
	
	public static boolean isSameLength(final byte[] array1,final byte[] array2){
		 return array1!= null && array1.length == array2.length;
	}
	

}