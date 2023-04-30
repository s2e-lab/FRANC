import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanConverter{
	/** 
	 * This method creates a copy of the provided array, and ensures that all the strings in the newly created array contain only lower-case letters. <p> Using this method to copy string arrays means that changes to the src array do not modify the dst array.
	 */
	
	private static String[] copyStrings(final String[] src){
		
		String[] new_dst = new String[src.length];
		for (int i=0; i < new_dst.length; i ++){
			new_dst[i] = new String(src[i].toLowerCase()).intern();
		}
		
		return new_dst;
	}
}