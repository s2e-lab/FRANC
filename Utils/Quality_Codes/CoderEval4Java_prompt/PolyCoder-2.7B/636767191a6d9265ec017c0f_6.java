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
		 
		byte[] newbytes = new byte[(this.buffer.length << 1) + size];
		System.arraycopy(this.buffer, 0, newbytes, 0, this.buffer.length);
		this.buffer = newbytes;
	}
	
	private byte[] getBytes() {
		if (this.position >= this.buffer.length)
			enlarge(this.position + this.size);

		return this.buffer;
	}
	
	private void clear(){
}
}