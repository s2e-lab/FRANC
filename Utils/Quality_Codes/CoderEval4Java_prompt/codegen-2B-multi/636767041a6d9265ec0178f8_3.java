import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanConverter{
	/** 
	 * This method creates a copy of the provided array, and ensures that all the strings in the newly created array contain only lower-case letters. <p> Using this method to copy string arrays means that changes to the src array do not modify the dst array.
	 */
	
	private static String[] copyStrings(final String[] src){
		if(src == null) throw new IllegalArgumentException("Input array is invalid");
		String[] dst = new String[src.length];
		for(int i = 0; i < src.length; i++) {
			dst[i] = String.valueOf(src[i].toLowerCase().charAt(0));
		}
		return dst;
	}

	/** 
	 * This method transforms src to a string array of characters. The result is guaranteed to be a set of all lowercase letters.
	 */

}