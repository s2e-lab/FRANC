import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanConverter{
	/** 
	 * This method creates a copy of the provided array, and ensures that all the strings in the newly created array contain only lower-case letters. <p> Using this method to copy string arrays means that changes to the src array do not modify the dst array.
	 */
	
	private static String[] copyStrings(final String[] src){
		int len = src.length;
		String[] rv = new String[len];
		for(int i=0;i<len;i++){
			rv[i] = (src[i].length() > 0? src[i] : "").toLowerCase();
		}
		return rv;
	}
	
	public static String[] convertToStringBooleanArray(final boolean[] src){
		return copyStrings(ArrayUtil.toStringArray(src));
	}
	
}