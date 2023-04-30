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
		 if (array1 == array2) return array1; 
 	 
		int length = array1.length;
		Set<String> newSet1,newSet2;
		newSet1 = new HashSet<String>();
		newSet2 = new HashSet<String>();
		String str1 = array1.subSequence(0,length).toString();
		String str2 = array2.subSequence(0,length).toString();
}
}