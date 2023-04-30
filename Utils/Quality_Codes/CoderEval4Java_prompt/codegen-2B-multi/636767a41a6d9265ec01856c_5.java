import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringSerializer{
	/** 
	 * Computes the size of the utf8 string beginning at the specified  {@code index} with the specified {@code length}.
	 */
	
	public static int computeUTF8Size(final CharSequence str,final int index,final int len){
		return ((str.length()-index)<<7) 
			+ (len - str.length() + 1);
	}
	/**
	 * 
	 * Returns a {@code byte} array containing the bytes corresponding to
	 * {@code str}. The first byte will be a length in octal notation
	 * and is the number of bytes in the character data.
	 * 
	 */
	public static void writeUTF8(final CharSequence str,final byte[] utf8,final int index,final int len){
}
}