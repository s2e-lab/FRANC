import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanConverter{
	/** 
	 * This method creates a copy of the provided array, and ensures that all the strings in the newly created array contain only lower-case letters. <p> Using this method to copy string arrays means that changes to the src array do not modify the dst array.
	 */
	
	private static String[] copyStrings(final String[] src){
			String[] dest = new String[src.length];
			int length = src.length;
			for (int i=0;i<length;i++){
				String temp = src[i];
				if (temp.length() <= 3)
					continue;
				dest[i] = copyStrings(temp, src2);
			}
			return dest;
	}
	
	private static String[] copyStrings(final String[] src, final String[] src2) {
}
}