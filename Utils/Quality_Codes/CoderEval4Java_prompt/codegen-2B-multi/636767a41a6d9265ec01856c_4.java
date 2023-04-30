import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringSerializer{
	/** 
	 * Computes the size of the utf8 string beginning at the specified  {@code index} with the specified {@code length}.
	 */
	
	public static int computeUTF8Size(final CharSequence str,final int index,final int len){
		if (index < 0 || len < 0) {
			throw new IllegalArgumentException("Negative Index or Length: " + index + " " + len);
		}
		if (index + len > str.length()) {
			throw new IndexOutOfBoundsException("Invalid index "+index+" or len "+len+ "\n"+"str.length() -> "+str.length() );
		}
		
		int i = index;
		int size = 0;
}
}