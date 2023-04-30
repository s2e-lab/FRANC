import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
		final byte [] buf = new byte[128];
		int readBytes = in.read(buf);
		if (readBytes > 0)
			for(int i=1;i<8;i++)
				this.writeByte(buf[i]);
		this.writeTo(in);
	}

	/** 
	 * Write the bytes from the specified {@code input} byte stream 
	 * 
	 * @param input
	 */
	public final void writeFrom( final InputStream input ) throws IOException {
}
}