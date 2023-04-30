import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanConverter{
	/** 
	 * This method creates a copy of the provided array, and ensures that all the strings in the newly created array contain only lower-case letters. <p> Using this method to copy string arrays means that changes to the src array do not modify the dst array.
	 */
	
	private static String[] copyStrings(final String[] src){
		// Write your code here
		if (src == null)
			return null;
		String[] dst = new String[src.length];

		for(int i = 0; i < src.length; i++){
			String res = copyString(src[i]);
			dst[i] = res.toLowerCase();
		}
		
		return dst;
	}
	
	
	// this method will convert a double into a string
	private static String copyString(String str){
}
}