import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
			int start=in.mark();
			boolean isReadEOF=in.mark()<0;
			byte[] bytes=new byte[1];

			while(isReadEOF)
				bytes=new byte[1];

		int totalRead=0;
		
}
}