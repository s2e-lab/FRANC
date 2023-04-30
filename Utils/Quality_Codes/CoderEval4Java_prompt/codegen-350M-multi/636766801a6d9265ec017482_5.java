import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
		this.stream = in;
		this.read = 0;
		try{
			this.readBytes();
		}
		catch(EOFException e){
			// read() closed end of data
		}
	}

	public void read(int n) throws IOException{
		byte[] bytes = new byte[n];
		this.stream.read(bytes);
}
}