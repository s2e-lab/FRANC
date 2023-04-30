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
		 //grow to get more bytes from the end.
		
		int newBytesInLastWord=size-this.size;
		if(newBytesInLastWord==0){
			throw new IllegalArgumentException("Byte vector too full.");
		}
		
		int numBytes=bytes.length+newBytesInLastWord;
		byte[][] newBytes=new byte[numBytes][];
		
		int j=bytes.length-1;
}
}