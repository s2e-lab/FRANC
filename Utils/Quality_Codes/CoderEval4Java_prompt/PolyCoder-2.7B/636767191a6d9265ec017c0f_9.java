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
		 /* Get rid of the current block if it is filled up. */
		 if(size==this.capacity)
			clear();
		 /* Use the new block if possible, otherwise get a new one. */
		 else{
			 final ByteBuffer bb=ByteBuffer.allocate(size);
			 bb.put(buffer, position, size);
			 position=0;
			 size=bb.position();
			 bb.clear();
				
			 buffer=bb;
			 capacity=size;
		 }
	}
	
	void clear(){
		 position=0;
}
}