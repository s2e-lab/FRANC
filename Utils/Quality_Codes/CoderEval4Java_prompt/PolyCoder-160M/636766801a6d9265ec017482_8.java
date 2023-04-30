import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
		 // read the byte array
		 byte bbuffer[] = new byte[1024];  
		 long len = in.read(bbuffer);
		 // at least one byte read
		 if (len < 0) {
			  assert(len==0);
			  if (!m_isReadOnly) {
			 printf("Buffer to read data is not read, can't read the bytes\n");
			  }
			  in.close();
			 } 
}
}