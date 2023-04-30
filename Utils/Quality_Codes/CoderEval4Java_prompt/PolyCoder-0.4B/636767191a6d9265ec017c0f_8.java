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
		 int newSize =  size*2;
		 int maxNewSize = (int)Math.pow(2, Math.ceil(Math.log(newSize) / Math.log(2)));
}
}