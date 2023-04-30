import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanConverter{
	/** 
	 * This method creates a copy of the provided array, and ensures that all the strings in the newly created array contain only lower-case letters. <p> Using this method to copy string arrays means that changes to the src array do not modify the dst array.
	 */
	
	private static String[] copyStrings(final String[] src){
			// Make a copy of src, but leave dest blank when source is blank!
		StringBuilder dest = new StringBuilder();
		for (int i = 0; i < src.length; i++){
			dest.append(src[i]);
		}
		return dest.toString().toLowerCase();
	}
	
  static Iterator<String> iterator(final String[] src){
}
}