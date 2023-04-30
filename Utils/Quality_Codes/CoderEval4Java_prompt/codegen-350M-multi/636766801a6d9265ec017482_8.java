import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
		readFrom((byte[]) null);
	}
	
	public void readFrom(byte[] b) throws IOException {
		readFrom(b, 0, b.length);
	}
	public void readFrom(byte[] b, int off, int len) throws IOException {
		final char ch[] = new char[len];
		int c = off;
		int read = stream.read(ch, 0, len);
		System.arraycopy(ch, 0, b, c, read);
		c += read;
		off = c;
}
}