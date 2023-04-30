import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class WriteSession{
	/** 
	 * Returns a single byte array containg all the contents written to the buffer(s).
	 */
	
	public final byte[] toByteArray(){
			// TODO: Implement the logic to concatenate all the contents written to the buffer(s) into a single byte array

		// Create a new ByteArrayOutputStream to hold the concatenated bytes
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		try {
			// Loop through each buffer in the buffer list
			for (ByteArrayOutputStream buffer : buffers) {
				// Write the contents of the buffer to the output stream
				outputStream.write(buffer.toByteArray());
			}

			// Close the output stream
			outputStream.close();
		} catch (IOException e) {
			// Handle any exceptions that occur
			e.printStackTrace();
		}

		// Return the concatenated byte array
		return outputStream.toByteArray();
	}

	private List<ByteArrayOutputStream> buffers;
	
	/**
	 * Constructs a new WriteSession object, initialized with an empty buffer.
	 */
	public WriteSession(){
		this.buffers = new ArrayList<>();
		this.buffers.add(new ByteArrayOutputStream());
	}
	
	/**
	 * Writes an array of bytes to the buffer.
	 */
	public final void write(byte[] bytes){
		// Get the last buffer in the list
		ByteArrayOutputStream buffer = buffers.get(buffers.size() - 1);

		try {
			// Write the bytes to the buffer
			buffer.write(bytes);
		} catch (IOException e) {
			// Handle any exceptions that occur
			e.printStackTrace();
		}
	}
	
	/**
	 * Appends a string to the buffer.
	 */
	public final void write(String string){
		// Convert the string to a byte array and write it to the buffer
		write(string.getBytes());
	}
	
	/**
	 * Returns the number of bytes written to the buffer(s).
	 */
	public final int size(){
		int size = 0;

		// Loop through each buffer in the buffer list and add its size to the total size
		for (ByteArrayOutputStream buffer : buffers) {
			size += buffer.size();
		}

		return size;
	}
	
	/**
	 * Creates a new buffer, which is used for subsequent write operations.
	 */
	public final void newBuffer(){
		// Create a new buffer and add it to the buffer list
		buffers.add(new ByteArrayOutputStream());
	}
}