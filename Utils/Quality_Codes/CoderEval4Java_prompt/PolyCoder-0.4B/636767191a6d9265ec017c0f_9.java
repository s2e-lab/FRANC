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
		 //
		 // Use 'Size' constant to avoid compiler errors.
		 //

		if (size > Size){
			size = Size;
		}
		this.size = size;
		this.head = new byte[size];
		this.tail = new byte[size];
		Arrays.fill(this.head, (byte)0);
		Arrays.fill(this.tail, (byte)0);
	}
	
	/**
	 * Returns this byte vector as a new byte array.
	 */
	
}