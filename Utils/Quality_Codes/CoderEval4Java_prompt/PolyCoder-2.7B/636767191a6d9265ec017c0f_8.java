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
			final int capacity = (this.size() << 1);
			byte[] array = new byte[capacity];
			int current = 0;
			int pos = 0;
			int remaining = this.size();
			
}
}