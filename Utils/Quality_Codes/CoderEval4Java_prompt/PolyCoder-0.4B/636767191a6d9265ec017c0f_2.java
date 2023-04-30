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
			//assert size <= Integer.MAX_VALUE;
		if(size==Integer.MAX_VALUE){
			throw new IllegalArgumentException("size can't be as big as Integer.MAX_VALUE");
		}
		if(size >= this.length){
			throw new IllegalArgumentException("size can't be greater than this.length");
		}
		
		
		
		if(size<=this.capacity()){
			// TODO 
		}
}
}