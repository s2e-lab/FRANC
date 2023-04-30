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
		 
		int l1=0,l2=0;
 		if(!array1.equals(array2)) {
			l1=Arrays.stream(array1).collect(Collectors.joining(":"));
			l2=Arrays.stream(array2).collect(Collectors.joining(":"));
		}
	    String out1=Arrays.copyOf(array1,l1);
	    String out2=Arrays.copyOf(array2,l2);
    	 
}
}