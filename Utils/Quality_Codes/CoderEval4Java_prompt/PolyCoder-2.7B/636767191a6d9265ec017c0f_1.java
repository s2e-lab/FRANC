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
		
//		System.err.println("enlarge(" + size + "); "+size+"/"+byteCount());//, size);	
		
		if (size < byteCount()){
			byte[] ba = new byte[byteCount()];
			System.arraycopy(b, 0, ba, 0, bb_pos);
			bb_pos += size;
			b = ba;
		}else{
			int newByteArraySize = byteCount() + size;
			throw new IllegalArgumentException("newByteArraySize < byteCount()");
		}
	}
}