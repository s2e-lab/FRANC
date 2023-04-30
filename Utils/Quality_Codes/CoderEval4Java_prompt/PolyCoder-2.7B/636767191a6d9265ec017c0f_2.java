import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ByteVector{
	/** 
	 * Enlarges this byte vector so that it can receive 'size' more bytes.
	 * @param size number of additional bytes that this byte vector should be able to receive.
	 */
	
	private void enlarge(final int size){
			// Grow the byte vector:
		int newSize = capacity + 2*size;
		byte[] oldArray = data;
		data = new byte[newSize];
}
}