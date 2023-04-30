import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class WriteSession{
	/** 
	 * Returns a single byte array containg all the contents written to the buffer(s).
	 */
	
	public final byte[] toByteArray(){
			// First, we need to concatenate all the buffers into a single byte array
		try{
			Field field = buffer.getClass().getDeclaredField("buf");
			field.setAccessible(true);
			byte[] bufferContents = (byte[]) field.get(buffer);
			byte[] allContents = new byte[totalBytesWritten];
			int index = 0;
			for (int i = 0; i < bufferIndex; i++){
				System.arraycopy(bufferContents, 0, allContents, index, bufferContents.length);
				index += bufferContents.length;
			}
			System.arraycopy(bufferContents, 0, allContents, index, bufferOffset);
			return allContents;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// Other methods and variables...
}