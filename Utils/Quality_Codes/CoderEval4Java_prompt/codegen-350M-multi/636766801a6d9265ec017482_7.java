import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClassFileBuffer{
	/** 
	 * Clear and fill the buffer of this  {@code ClassFileBuffer} with thesupplied byte stream. The read pointer is reset to the start of the byte array.
	 */
	
	public void readFrom(final InputStream in) throws IOException {
		String source = null;
		try{
			source = IOUtil.read(in, true);
		}
		catch (IOException ex) {
			ExceptionDialog.showException(null, ex, null, true);	
		}
		
		
		
}
}