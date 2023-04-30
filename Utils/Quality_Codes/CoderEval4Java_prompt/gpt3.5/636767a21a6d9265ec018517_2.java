import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class WriteSession{
	/** 
	 * Returns a single byte array containg all the contents written to the buffer(s).
	 */
	
	public final byte[] toByteArray(){
			Java
public byte[] toByteArray() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    try {
        for (ByteArrayOutputStream buffer : buffers) {
            outputStream.write(buffer.toByteArray());
        }
    } catch (IOException e) {
        // handle the exception
    }
    return outputStream.toByteArray();
}