import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
			// the following fields are used during the write of this buffer:
			// int byteCount;      // number of bytes that will be read in the field
			// int[] arrayAddress      // array address of this field
			// String name;            // field name in the ClassReader
			// int nameOffset;         // index of the field in the field table
			// int length;             // length
}
}