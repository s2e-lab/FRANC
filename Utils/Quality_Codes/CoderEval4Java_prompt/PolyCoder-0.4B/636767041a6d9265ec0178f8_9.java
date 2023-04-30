import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanConverter{
	/** 
	 * This method creates a copy of the provided array, and ensures that all the strings in the newly created array contain only lower-case letters. <p> Using this method to copy string arrays means that changes to the src array do not modify the dst array.
	 */
	
	private static String[] copyStrings(final String[] src){
			int max = src.length;
			if(max<1) {throw new Exception("Copy from a to b first..");}
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < src.length; i++){
				sb.append(src[i]);
				if(i < (i - max)){
					sb.append("-");
				}
			}
			return sb.toString().toCharArray();					// return a copy of the original array with first letter lowercased
	}



}