import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
		byte b[] = new byte[(int) in.available()];
		in.read(b);
		_buf = b;
	}
	
	
	/** 
	 * Write the contents of the {@code ClassFileBuffer} to the supplied byte stream with the current read pointer positioned at the start of the {@code byte} array.
	 */
	public void writeTo(final OutputStream out) throws IOException {
		out.write(_buf);
	}
	
}

