import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Trim the elements of the given String array, calling <code>String.trim()</code> on each of them.
	 * @param array the original String array
	 * @return the resulting array (of the same size) with trimmed elements
	 */
	
	public static String[] trimArrayElements(String[] array){
			String[] result = new String[array.length];
				
			for(int i=0; i<array.length;i++){
				result[i] = trim(array[i]);
			}
			return result;
	};
	
	/** 
	 * Find the empty string in the given array, returning that there is none. 
	 * @param array the array of strings
	 * @return a list with no strings, i.e. empty, if no string was found
	 */
}