import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringSerializer{
	/** 
	 * Computes the size of the utf8 string beginning at the specified  {@code index} with the specified {@code length}.
	 */
	
	public static int computeUTF8Size(final CharSequence str,final int index,final int len){
		int size =0;
		for (int i = 0; i<len;i++){
			size++;
			char c = str.charAt(index + i);
			if ( c > 127)
				size+= 3;
			else size++;
		}
		return size;
	}


	public static int computeSerializedUTF8Size(final CharSequence str) throws IOException{
		/* Compute the size of the serialized string taking into {@link IOException} into account. */
}
}