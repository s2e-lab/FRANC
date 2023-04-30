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
			resize(size);
			int newSize = count() + size;
			byte[] newData = byteArray();
			System.arraycopy(this, 0, newData, 0, this.index);
			System.arraycopy(this, 0, newData, this.index, newSize);
			this.index = newSize;
			byteArray = newData;
			return;
	}
	
	private void enlarge(final byte[] array){
}
}