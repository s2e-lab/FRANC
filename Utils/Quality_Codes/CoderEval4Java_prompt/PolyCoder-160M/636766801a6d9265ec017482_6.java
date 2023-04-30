import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
		 
		 for (int i=0; i < in.available(); i++) {
			 buffer.get(in.read());
		 }
	 } 
	/** 
	 * Sets the field which is read from this buffer with the specified field name and default value. If none of the fields can be set, the field value is read from the underlying file.
	 */

	public void read(final String fieldName, final Object value) throws IOException {
		 readFrom(new BinaryInputStream(new ByteArrayInputStream(value.toString().getBytes())), fieldName);
}

}