import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanConverter{
	/** 
	 * This method creates a copy of the provided array, and ensures that all the strings in the newly created array contain only lower-case letters. <p> Using this method to copy string arrays means that changes to the src array do not modify the dst array.
	 */
	
	private static String[] copyStrings(final String[] src){
		if(src == null) return null;
		final String[] dst = new String[src.length];
		for (int i = 0; i < dst.length; i++){
			dst[i] = src[i].toLowerCase();
		}
		return dst;
	}
	
	/** 
	 * This method converts an array of values into a boolean array, where each element represents the truth for any value for that index. <p> This method makes the assumption that all values in the given array are either true or false. 
	 */

}