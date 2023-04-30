import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanConverter{
	/** 
	 * This method creates a copy of the provided array, and ensures that all the strings in the newly created array contain only lower-case letters. <p> Using this method to copy string arrays means that changes to the src array do not modify the dst array.
	 */
	
	private static String[] copyStrings(final String[] src){
		String[] dst = new String[src.length];
        for (int i = 0; i < src.length; ++i) {
            dst[i] = src[i].toLowerCase();
        }
        return dst;
    }
	
    
	 /**
     * Given a String or char[], this is a recursive method that returns 
     * the string that should be pushed back in the stack when traversing
     * the binary tree. 
	*/
}