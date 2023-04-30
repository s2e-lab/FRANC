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
		
//		if (array == null)
//			return  new String[] {};
		
		String[] newArray = new String[ArrayUtils.intersection(	Arrays.asList(array), 
											Arrays.asList(  
														new String[] { " " })).length];
		
		for (int i=0; i<					
				newArray.length; i++){
				String newStr = array[i];
				newArray[i] = newStr.trim();
		}
		
		return newArray;

}
}