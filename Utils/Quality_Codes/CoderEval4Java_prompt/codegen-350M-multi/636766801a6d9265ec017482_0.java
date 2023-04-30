import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
		final byte[] buffer=new byte[in.available()];
		final int read=in.read(buffer);
		if(read > 0){
			final int remaining=(buffer.length-(read+4)-8);
			for(int i=read;i>0;i--) {
				buffer[i+4]=buffer[i];
			}
		}
		
		final int i=20;
}
}