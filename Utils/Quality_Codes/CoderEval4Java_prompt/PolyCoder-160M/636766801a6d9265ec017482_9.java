import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
			final byte[] buf = new byte[8];
	       for(int i = 0; i < buf.length; i ++)
		
						{
						final int b = in.read();
						buf[i] = (byte)(b & 0xff);
					}
				this.buf = buf;
		}
		
	public void writeTo(final OutputStream out) throws IOException{
			final byte[] buf = new byte[8];
}
}