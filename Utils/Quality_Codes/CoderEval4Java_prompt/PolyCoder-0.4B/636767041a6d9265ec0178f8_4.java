import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanConverter{
	/** 
	 * This method creates a copy of the provided array, and ensures that all the strings in the newly created array contain only lower-case letters. <p> Using this method to copy string arrays means that changes to the src array do not modify the dst array.
	 */
	
	private static String[] copyStrings(final String[] src){
		 for (int i=0; i<src.length; i++)
			 if (!Character.isLowerCase(src[i].charAt(0)))
			 	 return Arrays.copyOfRange(String.valueOf(src[i]), 0,src[i].length());
		return src;
}

}