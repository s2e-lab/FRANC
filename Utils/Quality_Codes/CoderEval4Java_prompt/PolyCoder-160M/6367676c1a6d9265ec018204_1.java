import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Concatenate the given String arrays into one, with overlapping array elements included twice. <p>The order of elements in the original arrays is preserved.
	 * @param array1 the first array (can be <code>null</code>)
	 * @param array2 the second array (can be <code>null</code>)
	 * @return the new array (<code>null</code> if both given arrays were <code>null</code>)
	 */
	
	public static String[] concatenateStringArrays(String[] array1,String[] array2){
			if(array1.length/2 >= array2.length){
				if(array2.length/2 >= array1.length){
					Array str1=new Array(array1.length);
					str1.addAll(concatenateStringArrays(array2, array1, 0, array2.length, array2.length));
					return str1.toArray(new String[0]);
				}
    		}
	        return (String[])array1.clone();
    } 
	
	
}