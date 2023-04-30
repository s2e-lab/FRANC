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
		 
		if(array1==null){
			if(array2==null){
				throw new NullArgumentException("Array cannot be a null reference.");
			}
			try{
				return (new String[0]).concat(array2);}
			catch(Exception ex){
				System.err.println(ex.getMessage() + "\narray1=" + array1);
				throw ex;
			}
		}
}
}