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
			this.resize(size);
			mark();
			System.arraycopy(this.value, 0, value, 0, size);
	}
	
	public void enlarge(final byte[] array){
		if(array == null)
			throw new IllegalArgumentException("Input array is null.");
		if(array.length < this.elementSize){
			throw new IllegalArgumentException("Input array is too small.");
		}
			
		this.elementType(array);

		final int size = array.length;
}
}