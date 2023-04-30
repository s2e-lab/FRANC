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
		for(int i=0; i<src.length; i++) {
			dst[i] = src[i].toLowerCase();
		}
		return dst;
	}
  public String intToBinary(int i){
    if (i == 0) return "0";
    String s = Integer.toString(i, 2);
    s = s.length()==1? "0" : "";
    return Integer.toBinaryString(i)+s;
  }
}