import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringSerializer{
	/** 
	 * Computes the size of the utf8 string beginning at the specified  {@code index} with the specified {@code length}.
	 */
	
	public static int computeUTF8Size(final CharSequence str,final int index,final int len){
		final int length = len == -1? str.length() - index : Math.min(str.length() - index, len);
		int utf8Size = 0;
		for (int n = 0; n < length; n++)
			utf8Size += getCharSize(charAt(str, index + n));
		return utf8Size;
	}
/** 
 * Returns the UTF8-encoded size of the character.
 */
	public static short getCharSize(final char c){
}
}