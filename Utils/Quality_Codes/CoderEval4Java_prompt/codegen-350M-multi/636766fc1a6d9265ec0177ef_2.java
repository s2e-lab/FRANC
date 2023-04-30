import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ReflectionToStringBuilder{
	/** 
	 * Returns a new array of Strings without null elements. Internal method used to normalize exclude lists (arrays and collections). Note that  {@link Arrays#sort(Object[])} will throw an {@link NullPointerException}if an array element is <code>null</code>.
	 * @param array The array to check
	 * @return The given array or a new array without null.
	 */
	
	static String[] toNoNullStringArray(Object[] array){
		//String[] ret
		String[] ret = new String[array.length];
		
		for( int j = 0;  j < ret.length;  j++ ){
			ret[j] = array[j].toString();
		}
		
		return ret;
		
	}
	/** Returns a copy of the given array. Internal use of this class.
	 * @param array The array to fill
	 * @return <code>array</code> or a copy of the given array.
	 */
	
	 
}