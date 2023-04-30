import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
		 //	try {System.out.println("ClassFileBuffer._readFrom: "+in);if(in == null){throw new NoSuchElementException();} else{new ClassFileDecoder().decode(in, getInputStream(in));}}finally {if(in!= null){System.out.println("end");}}
		 
		byte[] b = new byte[8];
		 
}
}