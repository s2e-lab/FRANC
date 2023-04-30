import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
		final char[] a = new char[4];
		int i = 0;
		while (true){
			final int read = in.read(a);
			if (read == -1)
				throw new IOException("End-of-data reached while waiting for a class byte");
			final int len = read;
			if (len > 4*i && len < a.length)
				i -= 4;
			if (len <= 4*i)
				break;
		}
}
}