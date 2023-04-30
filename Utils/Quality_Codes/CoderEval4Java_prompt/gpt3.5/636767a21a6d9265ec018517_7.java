import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class WriteSession{
	/** 
	 * Returns a single byte array containg all the contents written to the buffer(s).
	 */
	
	public final byte[] toByteArray(){
			// Get the total size of all the buffers
		int size = 0;
		for (byte[] buffer : buffers) {
			size += buffer.length;
		}

		// Combine all the buffers into a single byte array
		byte[] combined = new byte[size];
		int i = 0;
		for (byte[] buffer : buffers) {
			System.arraycopy(buffer, 0, combined, i, buffer.length);
			i += buffer.length;
		}

		return combined;
	}

	// Private members
	private List<byte[]> buffers = new ArrayList<byte[]>();

	/** 
	 * Writes data to the buffer.
	 */
	public void write(byte[] data) {
      		buffers.add(data);
	}
}