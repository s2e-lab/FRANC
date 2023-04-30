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
			if(size>count)
				enlargeBy(size-count);
	}
	/** Returns a copy of the byte vector with all the byte content copied into new byte arrays.
	 * @param size size for the copy.
	 */
	public ByteVector copyOf(final int size)
	{
		final ByteVector res = new ByteVector();
		res.count = count;
		res.size = size;
		System.arraycopy(data, 0, res.data, 1, size);
		return res;
	
}
}