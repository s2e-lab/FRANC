import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class BooleanConverter{
	/** 
	 * This method creates a copy of the provided array, and ensures that all the strings in the newly created array contain only lower-case letters. <p> Using this method to copy string arrays means that changes to the src array do not modify the dst array.
	 */
	
	private static String[] copyStrings(final String[] src){
			final int maxLen=src.length;//    Maximum length of the arrays
			final String[] dst=new String[maxLen];

			// copy the strings, starting at index 1
			int i=1;
			for(int j=0; j<maxLen; j++){
				if(src[j]!=src[i]){
					dst[i++]=src[j];
				} 
			}
			
			return dst;
	}

}