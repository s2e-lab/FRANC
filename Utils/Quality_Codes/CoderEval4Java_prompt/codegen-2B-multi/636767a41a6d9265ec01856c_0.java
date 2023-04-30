import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringSerializer{
	/** 
	 * Computes the size of the utf8 string beginning at the specified  {@code index} with the specified {@code length}.
	 */
	
	public static int computeUTF8Size(final CharSequence str,final int index,final int len){
		//TODO: computeUTF8Size is returning too big of a number in case of too large strings.  I think we need to revise the way we compute UTF8 size.
		int utf8Size=0;
		
		if (index < 0 || index >= str.length()){
			return 0;
		}
		
}
}