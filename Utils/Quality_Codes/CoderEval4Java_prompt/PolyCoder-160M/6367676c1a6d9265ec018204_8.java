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
			String[] newarray = new String[array1.length+array2.length];
			for(int i=0;i<array1.length;i++){
				newarray[i]=array1[i];
			}
			String[] t1=newstring(length(array1));
			String[] t2=newstring(length(array2));
}
}