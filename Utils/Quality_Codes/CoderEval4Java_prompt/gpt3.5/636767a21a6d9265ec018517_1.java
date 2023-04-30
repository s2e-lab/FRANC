import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class WriteSession{
	/** 
	 * Returns a single byte array containg all the contents written to the buffer(s).
	 */
	
	public final byte[] toByteArray(){
			// TODO: Implement the logic to merge all the contents written to the buffer(s) into a single byte array.
// Here's an example implementation using ByteArrayOutputStream:

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		for (ByteArrayOutputStream buf : buffers) {
			outputStream.write(buf.toByteArray(), 0, buf.size());
		}
		return outputStream.toByteArray();
	}

	private List<ByteArrayOutputStream> buffers;
	
	/**
	 * Constructor to initialize the list of underlying buffers.
	 */
	public WriteSession() {
		this.buffers = new LinkedList<ByteArrayOutputStream>();
	}
	
	/**
	 * Writes the given data to the underlying buffer(s).
	 * 
	 * @param data	data to be written to the buffer(s). 
	 */
	public void write(byte[] data) {
		// TODO: Implement the logic to write the given data to the buffer(s).
		// Here's an example implementation using ByteArrayOutputStream:
		ByteArrayOutputStream currentBuffer = getCurrentBuffer();
		currentBuffer.write(data, 0, data.length);
	}
	
	/**
	 * Flushes any pending writes and releases the underlying buffer(s).
	 * Once this method is called, no further writes are allowed.
	 */
	public void close() {
		// TODO: Implement the logic to flush any pending writes and release the underlying buffer(s).
		// Here's an example implementation using ByteArrayOutputStream:
		for (ByteArrayOutputStream buf : buffers) {
			try {
				buf.flush();
				buf.close();
			} catch (IOException e) {
				// handle the exception
			}
		}
		buffers.clear();
	}
	
	/**
	 * Returns the current buffer for writing data.
	 * If there are no buffers available, a new buffer is created and returned.
	 */
	private ByteArrayOutputStream getCurrentBuffer() {
		if (buffers.size() == 0) {
			buffers.add(new ByteArrayOutputStream());
		}
		
		ByteArrayOutputStream currentBuffer = buffers.get(buffers.size() - 1);
		if (currentBuffer.size() >= bufferSizeLimit) {
			// if the current buffer has reached its limit, create a new buffer
			buffers.add(new ByteArrayOutputStream());
			currentBuffer = buffers.get(buffers.size() - 1);
		}
		
		return currentBuffer;
	}
	
	public static final int bufferSizeLimit = 1024 * 1024; // 1MB
}