import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class WriteSession{
	/** 
	 * Returns a single byte array containg all the contents written to the buffer(s).
	 */
	
	public final byte[] toByteArray(){
			//Get the total size of the buffer(s)
		int totalSize = 0;
		for (byte[] buffer : buffers) {
			totalSize += buffer.length;
		}
		
		//Create the final byte array and copy the contents of the buffer(s) into it
		byte[] result = new byte[totalSize];
		int destPos = 0;
		for (byte[] buffer : buffers) {
			System.arraycopy(buffer, 0, result, destPos, buffer.length);
			destPos += buffer.length;
		}
		return result;
	}
	
	
	private List<byte[]> buffers = new ArrayList<byte[]>();
	private ByteArrayOutputStream currentStream;
	private static final int DEFAULT_BUFFER_SIZE = 8192;
	private int bufferSize = DEFAULT_BUFFER_SIZE;
	
	/**
	 * Sets the size of the buffer to be used for writing data.
	 * Note that this only affects buffers created after the call to this method.
	 * If you wish to change the size of existing buffers, you must manually re-allocate them
	 * and copy the data from the old buffer to the new one.
	 */
	public WriteSession setBufferSize(int bufferSize){
		this.bufferSize = bufferSize;
		return this; //For chaining
	}
	
	/**
	 * Writes the specified byte array to the buffer(s).
	 * If the current buffer is full, it is closed and a new buffer is created.
	 */
	public WriteSession write(byte[] data){
		if (data == null){
			return this;
		}
		
		if (currentStream == null){
			currentStream = new ByteArrayOutputStream(bufferSize);
		}
		
		while (data.length > 0){
			int remaining = bufferSize - currentStream.size();
			if (remaining == 0){
				if (buffers.isEmpty()){
					buffers.add(currentStream.toByteArray());
				}
				currentStream = new ByteArrayOutputStream(bufferSize);
				remaining = bufferSize;
			}
			
			int len = Math.min(data.length, remaining);
			currentStream.write(data, 0, len);
			data = Arrays.copyOfRange(data, len, data.length);
		}
		
		return this; //For chaining
	}
	
	/**
	 * Writes the specified byte to the buffer(s).
	 * If the current buffer is full, it is closed and a new buffer is created.
	 */
	public WriteSession write(byte data){
		if (currentStream == null){
			currentStream = new ByteArrayOutputStream(bufferSize);
		}
		
}
}